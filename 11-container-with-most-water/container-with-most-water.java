class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int maxWater=Integer.MIN_VALUE;
        while(i<j){
            int ht=Math.min(height[i],height[j]);
            int width=j-i;
            int water=ht*width;
            maxWater=Math.max(maxWater,water);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;
    }
}