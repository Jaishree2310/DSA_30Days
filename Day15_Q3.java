//108. Convert Sorted Array to Binary Search Tree


// public class Day15_Q3 {
//     class Solution {
//         public TreeNode sortedArrayToBST(int[] nums) {
//             if (nums.length == 0) {
//             return null;
//         }
    
//         TreeNode head = helper(nums, 0, nums.length - 1);
//         return head;
//     }
    
//     public TreeNode helper(int[] nums, int low, int high) {
//         if (low > high) { 
//             return null;
    
//         }
    
//         int mid = (low + high) / 2;
//         TreeNode node = new TreeNode(nums[mid]);
//         node.left = helper(nums, low, mid - 1);
//         node.right = helper(nums, mid + 1, high);
//         return node;
//         }
//     }
// }

public class Day15_Q3 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
    
        TreeNode head = helper(nums, 0, nums.length - 1);
        return head;
    }
    
    public static TreeNode helper(int[] nums, int low, int high) {
        if (low > high) { 
            return null;
        }
    
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, low, mid - 1);
        node.right = helper(nums, mid + 1, high);
        return node;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        
        TreeNode root = sortedArrayToBST(nums);
        
        // You can now perform any operations or traversals on the tree as needed.
        // For example, print the tree using an inorder traversal.
        inorderTraversal(root);
    }
    
    public static void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.val + " ");
            inorderTraversal(node.right);
        }
    }
}

