class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int mod = 1_000_000_007;

        // powers of 2
        int[] pow = new int[n];
        pow[0] = 1;
        for(int i = 1; i < n; i++){
            pow[i] = (pow[i-1] * 2) % mod;
        }

        int l = 0, r = n - 1;
        long ans = 0;

        while(l <= r){
            if(nums[l] + nums[r] <= target){
                ans = (ans + pow[r - l]) % mod;
                l++;
            } else {
                r--;
            }
        }

        return (int)ans;
    }
}