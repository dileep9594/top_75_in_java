package top_75_in_java.graphs;

public class Main {
    public static void main(String[] args){
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };

        numIsland ns = new numIsland() ;
        int ans = ns.numIsland(grid);
        System.out.println(ans);
        
    }
}
