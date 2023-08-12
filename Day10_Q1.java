//63. Unique Paths II

// public class Day10_Q1 {
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0 || obstacleGrid[0][0] == 1) {
//         return 0;
//     }

//     int m = obstacleGrid.length;
//     int n = obstacleGrid[0].length;

//     int[] previous = new int[n];
//     int[] current = new int[n];
//     previous[0] = 1;

//     for (int i = 0; i < m; i++) {
//         current[0] = obstacleGrid[i][0] == 1 ? 0 : previous[0];
//             for (int j = 1; j < n; j++) {
//             current[j] = obstacleGrid[i][j] == 1 ? 0 : current[j-1] + previous[j];
//         }
//         System.arraycopy(current, 0, previous, 0, n);
//     }

//     return previous[n-1];
// }
// }


public class Day10_Q1 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return 0;
        // Your uniquePathsWithObstacles implementation here
    }

    public static void main(String[] args) {
        // Example usage
        Day10_Q1 solution = new Day10_Q1();
        int[][] obstacleGrid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        int uniquePaths = solution.uniquePathsWithObstacles(obstacleGrid);
        System.out.println("Number of unique paths: " + uniquePaths);
    }
}
