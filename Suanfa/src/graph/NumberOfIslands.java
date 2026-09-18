package graph;

/**
 * ClassName:NumberOfIslands
 * Description:
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null||grid.length==0) {
            return 0;
        }
        int count =0;
        int col = grid.length;
        int row = grid[0].length;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (grid[i][i]=='1') {
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        int col = grid.length;
        int row = grid[0].length;
        if (i<0||i>=col||j<0||j>=row||grid[i][j]=='0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid,i-1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}
