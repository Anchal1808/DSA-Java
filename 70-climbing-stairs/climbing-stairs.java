class Solution {
    int stairs(int n,int[] dp){
        if(n==1||n==0){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]= stairs(n-1,dp)+stairs(n-2,dp);
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return stairs(n,dp);
    }
}