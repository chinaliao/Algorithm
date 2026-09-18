package binaryTree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * ClassName:KthSmallestElementInBST
 * Description:
 */
public class KthSmallestElementInBST {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        TreeNode curr = root;
        while (curr != null || !queue.isEmpty()) {
            while (curr!=null){
                queue.push(curr);
                curr = curr.left;
            }
             curr = queue.pop();
            k--;
            if (k==0) {
                return curr.val;
            }
            curr=curr.right;
        }
        return -1;
    }
}
