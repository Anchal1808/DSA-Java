class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
         if(k==1) return 0;
        Arrays.sort(nums);
        int minDiff=Integer.MAX_VALUE;
        int i=0;
        int j=k-1;
       while(j<n){
             int diff=nums[j]-nums[i];
             minDiff=Math.min(minDiff,diff);
             i++;
           j++;
       }
       return minDiff;
    }
}