package Feb42023;

import com.sun.source.tree.Tree;

import java.util.*;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Binary Tree Inorder Traversal
        TreeNode tree1 = new TreeNode(1);
        tree1.setRight(new TreeNode(2, new TreeNode(3), null));

        System.out.println(Arrays.toString(inorderTraversal(tree1).toArray()));

    }

    //Problem 1: Binary Tree Inorder Traversal
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inorderHelper(root, inorder);
        return inorder;
    }

    private static void inorderHelper(TreeNode node, List<Integer> list) {
        if(node == null) return;

        inorderHelper(node.getLeft(), list);
        list.add(node.getVal());
        inorderHelper(node.getRight(), list);
    }
}
