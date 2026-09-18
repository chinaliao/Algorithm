package binaryTree;

import java.util.List;

/**
 * ClassName:MaxDepthOfBinaryTree
 * Description:
 */
public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }
        return dfs(root,0);
    }
    private  int dfs(TreeNode root, int depth){
        if (root==null){
            return depth;
        }
        int left = dfs(root.left, depth + 1);
        int right = dfs(root.right, depth + 1);
        return Math.max(left,right);
    }
}
