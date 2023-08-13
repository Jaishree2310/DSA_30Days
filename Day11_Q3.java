//100. Same Tree

public class Day11_Q3 {
    public static void main(String[] args) {
        
        Day11_Q3 solution = new Day11_Q3();

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        boolean result = solution.isSameTree(p, q);

        
        System.out.println("Is Same Tree: " + result);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return false;
        
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}

