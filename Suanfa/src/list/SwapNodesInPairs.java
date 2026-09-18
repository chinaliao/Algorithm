package list;

/**
 * ClassName:SwapNodesInPairs
 * Description:
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(0,head);
    ListNode curr = dummy;
    while (curr.next!=null&&curr.next.next!=null){
        ListNode n1 = curr.next,n2 = curr.next.next;
        curr.next = n2;
        n1.next =n2.next;
        n2.next = n1;
        curr = n1;
    }
return dummy.next;

    }
}
