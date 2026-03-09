class Solution {

    int MOD = 1000000007;
    long[][][] dp;

    public int numberOfStableArrays(int zero, int one, int limit) {

        dp = new long[zero + 1][one + 1][2];

        for (int i = 0; i <= zero; i++) {
            for (int j = 0; j <= one; j++) {
                dp[i][j][0] = -1;
                dp[i][j][1] = -1;
            }
        }

        long ans = (solve(zero, one, 0, limit) + solve(zero, one, 1, limit)) % MOD;

        return (int) ans;
    }

    long solve(int z, int o, int last, int limit) {

        if (z == 0 && o == 0)
            return 1;

        if (dp[z][o][last] != -1)
            return dp[z][o][last];

        long ways = 0;

        if (last == 0) {

            // place 0s
            for (int k = 1; k <= limit && z - k >= 0; k++) {
                ways = (ways + solve(z - k, o, 1, limit)) % MOD;
            }

        } else {

            // place 1s
            for (int k = 1; k <= limit && o - k >= 0; k++) {
                ways = (ways + solve(z, o - k, 0, limit)) % MOD;
            }
        }

        return dp[z][o][last] = ways;
    }
}