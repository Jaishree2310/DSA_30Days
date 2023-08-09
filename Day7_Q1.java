//73. Set Matrix Zeroes

public class Day7_Q1 {
    
    public void setZeroes(int[][] matrix) {
        // Your existing setZeroes method implementation
    }

    public static void main(String[] args) {
        // Create an instance of Day7_Q1 or use the class methods directly
        Day7_Q1 day7 = new Day7_Q1();

        // Example usage
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };
        
        day7.setZeroes(matrix);

        // Print the modified matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

