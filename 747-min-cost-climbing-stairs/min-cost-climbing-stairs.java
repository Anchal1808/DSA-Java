class Solution {
    public int minCost(int i,int[] cost,int[] dp){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int oneStep=minCost(i+1,cost,dp);
        int twoStep=minCost(i+2,cost,dp);
        return dp[i]=cost[i]+Math.min(oneStep,twoStep);
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        int startZero=minCost(0,cost,dp);
        int startOne=minCost(1,cost,dp);
        return Math.min(startZero,startOne);
    }
}