class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
         long sum=0;
        for(int i=0;i<n;i++){
            long lar=nums[i];
            long small=nums[i];
            for(int j=i+1;j<n;j++){
                lar=Math.max(lar,nums[j]);
                small=Math.min(small,nums[j]);
               long tsum=lar-small;
                sum+=tsum;
            }
        }
        return sum;
    }
}