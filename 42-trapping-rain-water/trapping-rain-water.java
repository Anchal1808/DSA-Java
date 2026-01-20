class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] prefixleftmax=new int[n];
        int[] suffixrightmax=new int[n];
        //find prefixmax
        prefixleftmax[0]=height[0];
        for(int i=1;i<n;i++){
            prefixleftmax[i]=Math.max(prefixleftmax[i-1],height[i]);
        }
        //find suffixmax
        suffixrightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            suffixrightmax[i]=Math.max(suffixrightmax[i+1],height[i]);
        }
        //calculating water
        int totalWater=0;
        for(int i=0;i<n;i++){
            totalWater+=Math.min(prefixleftmax[i],suffixrightmax[i])-height[i];
        }
        return totalWater;
    }
}