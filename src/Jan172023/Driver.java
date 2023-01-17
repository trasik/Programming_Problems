package Jan172023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(1);
        node.right = new TreeNode(3);

        System.out.println("Is Valid?: " + isValidBST(node));
    }

    //Problem 1
    public static boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }


    private static boolean isValidBSTHelper(TreeNode node, long min, long max) {
        if(node == null) return true;

        if(node.val <= min || node.val >= max) return false;

        return isValidBSTHelper(node.left, min, node.val) && isValidBSTHelper(node.right, node.val, max);
    }
}
