//



public class Day17_Q3{
    public static void main(String args[]){
    
    class Solution {
        public int numIslands(char[][] grid) {
            int islandCount = 0;
    
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == '1') {
                        islandCount++;
                        searchIslandBFS(grid, i, j);
                    }
                }
            }
    
            return islandCount;
        }
    
        public void searchIslandBFS(char[][] grid, int i, int j) {
            // Check the boundaries and the current cell's value.
            if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
                return;
            }
    
            // Set the value of the grid cell to '0'.
            grid[i][j] = '0';
    
            searchIslandBFS(grid, i + 1, j);
            searchIslandBFS(grid, i - 1, j);
            searchIslandBFS(grid, i, j + 1);
            searchIslandBFS(grid, i, j - 1);
        }
    }
}
}

