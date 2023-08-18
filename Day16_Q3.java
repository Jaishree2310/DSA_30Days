//404. Sum of Left Leaves

public class Day16_Q3 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static class Solution {

        static int result;

        public int sumOfLeftLeaves(TreeNode root) {
            result = 0;

            task(root.left, true);
            task(root.right, false);

            return result;
        }

        static void task(TreeNode root, boolean flag) {
            if (root == null) return;

            if (flag && root.left == null && root.right == null) result += root.val;

            task(root.left, true);
            task(root.right, false);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();
        int sum = solution.sumOfLeftLeaves(root);
        System.out.println("Sum of left leaves: " + sum);
    }
}
