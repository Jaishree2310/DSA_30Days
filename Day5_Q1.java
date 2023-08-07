public class Day5_Q1 {
    // Your existing method for searching the matrix goes here...

    public static void main(String[] args) {
        // Test your searchMatrix method here...
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };

        int target = 9;
        Day5_Q1 obj = new Day5_Q1();
        boolean result = obj.searchMatrix(matrix, target);

        if (result) {
            System.out.println("Target found in the matrix.");
        } else {
            System.out.println("Target not found in the matrix.");
        }
    }

    private boolean searchMatrix(int[][] matrix, int target) {
        return false;
    }
}


