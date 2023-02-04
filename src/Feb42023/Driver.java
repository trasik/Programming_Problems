package Feb42023;

import com.sun.source.tree.Tree;

import java.util.*;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Binary Tree Inorder Traversal
        TreeNode tree1 = new TreeNode(1);
        tree1.setRight(new TreeNode(2, new TreeNode(3), null));

        System.out.println(Arrays.toString(inorderTraversal(tree1).toArray()));

        //Problem 2: Symmetric Tree
        TreeNode tree2 = new TreeNode(1);
        tree2.setLeft(new TreeNode(2, new TreeNode(3), new TreeNode(4)));
        tree2.setRight(new TreeNode(2, new TreeNode(4), new TreeNode(3)));

        System.out.println("Is Given Tree Symmetric?: " + isSymmetric(tree2));

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

    //Problem 2: Symmetric Tree
    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return false;

        return isSymmetricHelper(root.getLeft(), root.getRight());
    }

    private static boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        if(left == null || right == null) return left == right;

        if(left.getVal() != right.getVal()) return false;

        return isSymmetricHelper(left.getLeft(), right.getRight()) && isSymmetricHelper(left.getRight(), right.getLeft());
    }
}
