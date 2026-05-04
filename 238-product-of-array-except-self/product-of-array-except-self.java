class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
    int[] ans=new int[nums.length];
    int[] preProduct=new int[nums.length];
    int[] suffixProduct=new int[nums.length];
    suffixProduct[n-1]=1;
    preProduct[0]=1;
    for(int i=1;i<n;i++){
       preProduct[i]=nums[i-1]*preProduct[i-1];
    }
    for(int i=n-2;i>=0;i--){
        suffixProduct[i]=nums[i+1]*suffixProduct[i+1];
    }
    for(int i=0;i<n;i++){
        ans[i]=suffixProduct[i]*preProduct[i];
    }
    return ans;
    }
}
        