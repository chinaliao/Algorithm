package binaryTree;

/**
 * ClassName:ConvertSortedArrayToBinarySearchTree
 * Description:
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int l = nums.length;
        return buildTree(nums,0,l-1);
    }
    private TreeNode buildTree(int[] nums,int left,int right){
        if (left>right){
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildTree(nums,left,mid-1);
        root.right = buildTree(nums,mid+1,right);

        return root;
    }
}
