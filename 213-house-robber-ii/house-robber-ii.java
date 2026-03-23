class Solution {
    public int robber(int i,int endPoint,int[] arr,int[] dp){
        if(i>endPoint){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int pick=arr[i]+robber(i+2,endPoint,arr,dp);
        int ntpick=robber(i+1,endPoint,arr,dp);
        return dp[i]=Math.max(pick,ntpick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(nums.length==1){
            return nums[0];
        }
        // here two cases were use 1st exclude the last so range from 0 to n-2 and 2nd from 1 to n-1 here first is excluded 
        int[] dp1=new int[n];
        for(int i=0;i<dp1.length;i++){
            dp1[i]=-1;
        }
        int case1=robber(0,n-2,nums,dp1);
        int[] dp2=new int[n];
        for(int i=0;i<dp2.length;i++){
            dp2[i]=-1;
        }
        int case2=robber(1,n-1,nums,dp2);
        return Math.max(case1,case2);
    }
}