// Custom TreeNode class for the binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Day4_Q1 {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans = new int[1];
        maxDepth(root, ans);
        return ans[0];
    }

    int maxDepth(TreeNode root, int[] arr) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left, arr);
        int rightHeight = maxDepth(root.right, arr);
        arr[0] = Math.max(arr[0], leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // You can create a binary tree here and call diameterOfBinaryTree method
        // to find the diameter of the binary tree.
        //Example:
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int diameter = new Day4_Q1().diameterOfBinaryTree(root);
        System.out.println("Diameter of the binary tree: " + diameter);
    }
}

