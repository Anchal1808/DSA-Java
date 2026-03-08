class Solution {
    int[][] dp;

     public int solve(int i, int j, String t1, String t2){

        if(i == t1.length() || j == t2.length())
            return 0;

        if(dp[i][j] != -1)
            return dp[i][j];

        if(t1.charAt(i) == t2.charAt(j)){
            return dp[i][j] = 1 + solve(i+1, j+1, t1, t2);
        }

        return dp[i][j] = Math.max(
                solve(i+1, j, t1, t2),
                solve(i, j+1, t1, t2)
        );
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        dp = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                dp[i][j] = -1;
            }
        }

        return solve(0, 0, text1, text2);
    }
}