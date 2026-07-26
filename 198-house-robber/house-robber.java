class Solution {
    public int robb(int i,int[] arr,int[] dp){
        //if i==2 and call i+2 which is 4 so the codn give false and out of bound go
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int ntpick=robb(i+1,arr,dp);
        int pick=arr[i]+robb(i+2,arr,dp);
        return dp[i]=Math.max(ntpick,pick);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return robb(0,nums,dp);
    }
}