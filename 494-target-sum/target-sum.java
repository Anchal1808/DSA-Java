class Solution {
    private int countSubsets(int[] nums, int sum) {
        
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        
        for (int num : nums) {
            for (int j = sum; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        
        return dp[sum];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;
        
        // edge case
        if ((target + totalSum) % 2 != 0 || Math.abs(target) > totalSum) {
            return 0;
        }
        
        int sum = (target + totalSum) / 2;
        
        return countSubsets(nums, sum);
    }
    }
