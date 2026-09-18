package binaryTree;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:BuildTreeFromPreorderInorder
 * Description:
 */
public class BuildTreeFromPreorderInorder {
    private Map<Integer,Integer> inorderMap;
    private int preorderIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap = new HashMap<>();
        preorderIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i],i);
        }
        return helper(preorder,0,inorder.length-1);
    }
    private TreeNode helper(int[] preorder,int inorderStart,int inorderEnd){
        if (inorderStart>inorderEnd) {
            return null;
        }
        int rootValue = preorder[preorderIndex];
        TreeNode root = new TreeNode(rootValue);
        
        preorderIndex++;

        Integer inorderIndex = inorderMap.get(rootValue);

        root.left = helper(preorder,inorderStart,inorderIndex-1);
        root.right =helper(preorder,inorderIndex+1,inorderEnd);

        return root;
    }
}
