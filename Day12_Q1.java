//94. Binary Tree Inorder Traversal

import java.util.ArrayList;
import java.util.List;

public class Day12_Q1 {
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Day12_Q1 solution = new Day12_Q1();
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println(result);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    private void helper(TreeNode node, List<Integer> ans) {
        if (node == null) return;

        helper(node.left, ans);
        ans.add(node.val);
        helper(node.right, ans);
    }

    
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
