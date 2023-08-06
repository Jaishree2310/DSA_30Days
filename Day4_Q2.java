// Custom TreeNode class for the binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Day4_Q2 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // You can create a binary tree here and call invertTree method
        // to invert the binary tree.
        // Example:
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        Day4_Q2 q2 = new Day4_Q2();
        TreeNode invertedTree = q2.invertTree(root);
        System.out.println("Inverted binary tree: " + invertedTree);
    }
}

