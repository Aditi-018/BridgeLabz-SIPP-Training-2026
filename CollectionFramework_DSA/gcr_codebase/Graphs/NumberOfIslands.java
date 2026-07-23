class Solution {

    private int[] dr = {-1, 1, 0, 0};
    private int[] dc = {0, 0, -1, 1};

    public int numIslands(char[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int r, int c) {

        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length
                || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';

        for (int i = 0; i < 4; i++) {
            dfs(grid, r + dr[i], c + dc[i]);
        }
    }
}