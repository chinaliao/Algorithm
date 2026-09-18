package binaryTree;

/**
 * ClassName:LowestCimmonAncestorOfAbinaryTree
 * Description:
 */
public class LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
           return  dfs(root,p,q);
    }
    private TreeNode dfs(TreeNode root,TreeNode p,TreeNode q){
        if (root == null) {
            return null;
        }
        if (root==p||root==q){
            return root;
        }

        TreeNode left = dfs(root.left, p, q);
        TreeNode right = dfs(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }
        return left!=null? left:right;
    }
}
