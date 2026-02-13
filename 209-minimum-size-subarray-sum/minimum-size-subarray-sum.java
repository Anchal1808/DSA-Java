class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    //     int n=nums.length;
    //     int minlen=Integer.MAX_VALUE;
    //     for(int i=0;i<n;i++){
    //         int sum=0;
    //         for(int j=i;j<n;j++){
    //             sum+=nums[j];
    //             if(sum>=target){ 
    //             int len=j-i+1;
    //             minlen=Math.min(minlen,len);
    //             break;
    //             }
    //         }
    //     }

    //    return (minlen==Integer.MAX_VALUE) ? 0 : minlen;


    int n=nums.length;
    int sum=0;
    int minlen=Integer.MAX_VALUE;
    int i=0;
    int j=0;
    while(j<n){
        sum+=nums[j];
        while(sum>=target){
            int len=j-i+1;
        minlen=Math.min(minlen,len);
        sum-=nums[i];
        i++;
        }
        j++;
    }
    //  return minlen == Integer.MAX_VALUE ? 0 : minlen;
    if(minlen==Integer.MAX_VALUE){
        return 0;
    }
    else{
        return minlen;
    }
    }
}