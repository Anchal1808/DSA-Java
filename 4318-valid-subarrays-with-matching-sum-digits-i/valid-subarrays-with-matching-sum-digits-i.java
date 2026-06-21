class Solution {
     private int firstDigit(long num) {
        while (num >= 10) {
            num /= 10;
        }
        return (int) num;
    }
    public int countValidSubarrays(int[] nums, int x) {
         int n = nums.length;

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int ans = 0;

        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                long sum = prefix[r + 1] - prefix[l];

                if (sum % 10 != x) {
                    continue;
                }

                if (firstDigit(sum) == x) {
                    ans++;
                }
            }
        }

        return ans;
    }
}