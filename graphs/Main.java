package graphs;

public class Main {
    public static void main(String[] args){
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };

        NumIsland ns = new NumIsland() ;
        int ans = ns.numIsland(grid);
        System.out.println(ans);
        
    }
}
