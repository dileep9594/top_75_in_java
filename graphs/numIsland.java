package graphs;

public class NumIsland {

    private void dfs(char[][] grid, int row, int col) {
        int numRows = grid.length;
        int numCols = grid[0].length;
    
        if (row < 0 || col < 0 || row >= numRows || col >= numCols || grid[row][col] == '0') {
            return;
        }
    
        grid[row][col] = '0'; // Mark the current cell as visited
        // Recursively check neighboring cells
        dfs(grid, row - 1, col);
        dfs(grid, row + 1, col);
        dfs(grid, row, col - 1);
        dfs(grid, row, col + 1);
    }

    public int numIsland(char[][] grid){
        if (grid == null || grid.length == 0 ){
            return 0;
        }
        int numRows = grid.length ;
        int numCols = grid[0].length;
        int numIsland = 0;
        for (int i =0 ;i<numRows;i++){
            for (int j=0 ; j<numCols ; j++){
                if (grid[i][j] == '1') {
                    numIsland++;
                    dfs(grid, i, j);
                }
            }
    }
 return numIsland;   
}

}
