package Jan152023;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Driver {

    public static void main(String[] args) {
        //Problem 1
        /* root = [1,null,3,2,4,null,5,6] cannot test as I don't know how N-ary tree serialization is done*/

        //Problem 2
        TreeNode rightChild = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, new TreeNode(9), rightChild);

        printList2(levelOrder(root));
    }

    //Problem 1
    public static List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();

        preorderHelper(root, result);

        return result;
    }

    private static void preorderHelper(Node node, List<Integer> list) {
        if(node == null) return;

        list.add(node.val);

        for(Node child : node.children) preorderHelper(child, list);
    }

    //Problem 2
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < levelSize; i++) {
                TreeNode current = queue.remove();
                level.add(current.val);
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            result.add(level);
        }

        return result;
    }

    private static void printList(List<Integer> list) {
        for(int num : list) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    private static void printList2(List<List<Integer>> list) {
        for(List<Integer> l : list) {
            System.out.print("[");
            for(int num : l) {
                System.out.print(num + ",");
            }
            System.out.print("],");
        }
        System.out.println();
    }
}
