import java.util.ArrayList;
import java.util.List;

// Custom TreeNode class for the binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Day4_Q3 {

    List<TreeNode> list = new ArrayList<>();

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        dfs(root);
        String str = path(subRoot);
        for (int i = 0; i < list.size(); i++) {
            TreeNode front = list.get(i);
            String ans = path(front);
            if (ans.equals(str))
                return true;
        }
        return false;
    }

    public String path(TreeNode root) {
        if (root == null)
            return "#";
        return root.val + "," + path(root.left) + "," + path(root.right);
    }

    public void dfs(TreeNode root) {
        if (root == null)
            return;
        list.add(root);
        dfs(root.left);
        dfs(root.right);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // You can create binary trees here and call isSubtree method
        // to check if one tree is a subtree of another tree.
        // Example:
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(5);
        
        Day4_Q3 q3 = new Day4_Q3();
        boolean isSubtree = q3.isSubtree(root1, root2);
        System.out.println("Is subtree: " + isSubtree);
    }
}
