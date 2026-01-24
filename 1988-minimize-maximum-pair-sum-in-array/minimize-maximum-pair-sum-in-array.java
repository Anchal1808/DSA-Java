class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int maxsum=0;
        while(i<j){
            int pairsum=nums[i]+nums[j];
            maxsum=Math.max(maxsum,pairsum);
            i++;
            j--;
        }
        return maxsum;
    }
}