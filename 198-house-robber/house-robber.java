class Solution {
    public static int robber(int i,int[] arr,int[] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int pick=arr[i]+robber(i+2,arr,dp);
        int ntpick=robber(i+1,arr,dp);
        return dp[i]=Math.max(pick,ntpick);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
      return robber(0,nums,dp);  
    }
}