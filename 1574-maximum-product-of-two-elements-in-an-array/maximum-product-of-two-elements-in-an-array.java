class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int one=(nums[n-1]-1)*(nums[n-2]-1);
        int two=(nums[0]-1)*(nums[n-1]-1);
      return Math.max(one,two);
    }
}