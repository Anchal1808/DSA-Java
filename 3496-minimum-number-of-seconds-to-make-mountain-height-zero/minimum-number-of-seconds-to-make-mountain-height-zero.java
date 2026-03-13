class Solution {
    boolean canReduce(long time, int height, int[] workerTimes) {
        
        long total = 0;
        
        for (int w : workerTimes) {
            
            long low = 0, high = height;
            long best = 0;
            
            while (low <= high) {
                
                long mid = (low + high) / 2;
                long cost = (long)w * mid * (mid + 1) / 2;
                
                if (cost <= time) {
                    best = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            
            total += best;
            if (total >= height) return true;
        }
        
        return false;
    }
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left = 1;
        long right = (long)1e18;
        long ans = right;
        
        while (left <= right) {
            
            long mid = left + (right - left) / 2;
            
            if (canReduce(mid, mountainHeight, workerTimes)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return ans;
    }
}