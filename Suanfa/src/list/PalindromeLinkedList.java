package list;

/**
 * ClassName:palindromeLinkedList
 * Description:
 */
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if (head==null||head.next==null) {
            return true;
        }
        ListNode slow=head,fast = head;
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode p2 = reverse(slow.next),p1 = head;
        while (p2!=null){
            if (p1.val!= p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    private ListNode reverse(ListNode node) {
        ListNode prev = null,curr = node;
        while (curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
