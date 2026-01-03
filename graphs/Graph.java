package graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graph {
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
private int  dfs(int[][] grid, Set<String>visit , int row, int col) {
    int numRows = grid.length;
    int numCols = grid[0].length;

    if (row < 0 || col < 0 || row == numRows || col == numCols || visit.contains(row + "," + col) || grid[row][col] == 0) {
        return 0;
    }
    visit.add(row + "," + col) ;
    return 1+dfs(grid,visit, row - 1, col) + dfs(grid,visit, row + 1, col) + dfs(grid,visit, row, col - 1)+dfs(grid,visit, row, col + 1);
}
    public int maxAreaOfIsland(int[][] grid) {
          if (grid == null || grid.length == 0 ){
            return 0;
        }
        Set<String> visit = new HashSet();
        int numRows = grid.length ;
        int numCols = grid[0].length;
        int numIsland = 0;
        for (int i =0 ;i<numRows;i++){
            for (int j=0 ; j<numCols ; j++){
                if (grid[i][j] == 1) {
                    numIsland = Math.max(numIsland, dfs(grid,visit , i, j)) ;
                }
            }
        }
        return numIsland ;
}  

    Node clone(Node node, HashMap<Node,Node> oldToNew){
        if (node == null){
            return null ;
        }
        if(oldToNew.containsKey(node)){
            return oldToNew.get(node) ;
        }
        Node copy = new Node(node.val) ;
        oldToNew.put(node,copy) ;
        for(Node nei : node.neighbors){
            copy.neighbors.add(clone(nei,oldToNew)) ;
        }
        return copy ;
    }
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        HashMap<Node,Node> oldToNew = new HashMap() ;
        return clone(node,oldToNew) ;
    }

}
