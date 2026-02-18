class Solution {
    public static long robber(int i,int[] nums,int[] colors,long[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        //pick
        int j=i+1;
        if(i+1<nums.length && colors[i]==colors[i+1]){
            j=i+2;
        }
       long pick=nums[i]+robber(j,nums,colors,dp);

        //not pick
        long ntpick=robber(i+1,nums,colors,dp);
        return dp[i]=Math.max(pick,ntpick);
    }
    public long rob(int[] nums, int[] colors) {
      long[] dp=new long[nums.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return  robber(0,nums,colors,dp);
    }
}