class Solution {
    int solve(int r1, int c1, int r2, int[][] grid, int[][][] dp) {

        int n = grid.length;

        int c2 = r1 + c1 - r2;

        // Invalid position
        if(r1 >= n || c1 >= n || r2 >= n || c2 >= n) {
            return Integer.MIN_VALUE;
        }

        // Thorn
        if(grid[r1][c1] == -1 || grid[r2][c2] == -1) {
            return Integer.MIN_VALUE;
        }

        // Destination
        if(r1 == n - 1 && c1 == n - 1) {
            return grid[r1][c1];
        }

        // Already calculated
        if(dp[r1][c1][r2] != -1) {
            return dp[r1][c1][r2];
        }

        int cherries = 0;

        // Same cell
        if(r1 == r2 && c1 == c2) {
            cherries = grid[r1][c1];
        }
        else {
            cherries = grid[r1][c1] + grid[r2][c2];
        }

        // 4 choices
        int a = solve(r1 + 1, c1, r2 + 1, grid, dp);
        int b = solve(r1 + 1, c1, r2, grid, dp);
        int c = solve(r1, c1 + 1, r2 + 1, grid, dp);
        int d = solve(r1, c1 + 1, r2, grid, dp);

        int best = Math.max(
            Math.max(a, b),
            Math.max(c, d)
        );

        if(best == Integer.MIN_VALUE) {
            return dp[r1][c1][r2] = Integer.MIN_VALUE;
        }

        return dp[r1][c1][r2] = cherries + best;
    }
    public int cherryPickup(int[][] grid) {
    
        int n = grid.length;
        int[][][] dp = new int[n][n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        int ans = solve(0, 0, 0, grid, dp);
 if(ans < 0) {
            return 0;
        }
        return ans;
    }
}