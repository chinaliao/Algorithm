package binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:FlattenBinaryTreeToLinkedList
 * Description: 有两种解决方法，一种是简单的，先把树真的转成list（遍历树），然后再按照要求构建完全右子树
 * 第二种是，当前节点的右节点一定小于且相近于左节点的最右节点
 */
public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        if (root==null) {
            return;
        }
        List<TreeNode> list = new ArrayList<>();
        preOrder(root,list);
        for (int i = 0; i < list.size()-1; i++) {
            TreeNode current = list.get(i);
            TreeNode next = list.get(i + 1);
            current.left = null;
            current.right = next;
        }
    }
    private void preOrder(TreeNode root, List<TreeNode> list){
        if (root == null) {
            return;
        }
        list.add(root);
        preOrder(root.left,list);
        preOrder(root.right,list);

    }

    private void flatten2(TreeNode root){
        TreeNode current = root;
        while (current != null) {
            if (current.left!=null) {
                TreeNode temp = current.left;
                while (temp.right!=null){
                    temp = temp.right;
                }
                temp.right=current.right;
                current.right=current.left;
                current.left=null;
            }
            current=current.right;
        }
    }
}
