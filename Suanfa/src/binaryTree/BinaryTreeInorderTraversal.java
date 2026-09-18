package binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:BinaryTreeInorderTraversal
 * Description:
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root,res);
        return res;
    }
    private  void dfs(TreeNode root,List<Integer> list){
        if (root==null) {
            return;
        }
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }
}
