class Solution {
    public int maxArea(int[] height) {
     int n=height.length;
     int maxwater=0;
     int i=0;
     int j=n-1;
    while(i<j){
            int h=Math.min(height[i],height[j]);
            int weidth=j-i;
            int water=h*weidth;
            maxwater=Math.max(maxwater,water);
        
        if(height[i]<height[j]){
            i++;
        }
        else{
            j--;
        }
    }
     
     return maxwater;


    }
}