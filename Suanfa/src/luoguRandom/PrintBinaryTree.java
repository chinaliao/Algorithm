package luoguRandom;

import org.w3c.dom.Node;

import java.util.Scanner;

/**
 * ClassName:PrintBinaryTree
 * Description:
 */
public class PrintBinaryTree {
    static class Node{
        Node left,right;
        int val;
        Node(int val){ this.val=val; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextLine()) return;
        String line = sc.nextLine();
        if (line.isEmpty()) {
            return;
        }
        String[] split = line.split("\\s+");
        Node root = null;
        for (String s : split) {
            root = insert(root,Integer.parseInt(s));
        }
    }
    static Node insert(Node root,int val){
        if (root==null) return new Node(val);
        if (val<root.val) root.left =  insert(root.left,val);
        else root.right = insert(root.right,val);
        return root;
    }
    static void printTree(Node node,String prefix, boolean isTail, boolean isRoot){

    }
}
