class Solution {
    public int trap(int[] height) {
        int n=height.length;
         int totalWater=0;
        // int[] prefix=new int[n];
        // int[] suffix=new int[n];
        // //prefix
        // prefix[0]=height[0];
        // for(int i=1;i<n;i++){
        //     prefix[i]=Math.max(prefix[i-1],height[i]);
        // }
        // //suffix
        // suffix[n-1]=height[n-1];
        // for(int i=n-2;i>=0;i--){
        //    suffix[i]=Math.max(suffix[i+1],height[i]);
        // }
        // for(int i=0;i<n;i++){
        //     totalWater+=Math.min(prefix[i],suffix[i])-height[i];
        // }
        // return totalWater;

    int l=0;
    int r=n-1;
    int lmax=0,rmax=0;
    while(l<r){
        lmax=Math.max(lmax,height[l]);
        rmax=Math.max(rmax,height[r]);
        if(lmax<rmax){
            totalWater+=lmax-height[l];
            l++;
        }
        else{
            totalWater+=rmax-height[r];
            r--;
        }
    }
    return totalWater;

    }
}