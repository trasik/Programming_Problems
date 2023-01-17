package Jan172023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(1);
        node.right = new TreeNode(3);

        System.out.println("Is Valid?: " + isValidBST(node));

        //Problem 2
        TreeNode temp1 = new TreeNode(4, new TreeNode(3), new TreeNode(5));
        TreeNode temp2 = new TreeNode(2, new TreeNode(0), temp1);
        TreeNode temp3 = new TreeNode(8, new TreeNode(7), new TreeNode(9));
        TreeNode root = new TreeNode(6, temp2, temp3);

        System.out.println("LCA: " + lowestCommonAncestor(root, temp2, temp3).val);
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

    //Problem 2
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return root;

        if(root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        else if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        else return root;
    }
}
