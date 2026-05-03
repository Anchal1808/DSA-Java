class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        // for(int i=0;i<n;i++){
        //     int cnt=0;
        //     if(nums[i]%2!=0){
        //         for(int j=i+1;j<n;j++){
        //             if(nums[j]%2==0){
        //                 cnt++;
        //             }
        //         }
        //     }
        //     else if(nums[i]%2==0){
        //         for(int j=i+1;j<n;j++){
        //             if(nums[j]%2!=0){
        //                 cnt++;
        //             }
        //         }
        //     }
        //     ans[i]=cnt;
        // }
        // return ans;
        int evenCnt=0;
        int oddCnt=0;
        for(int i=n-1;i>=0;i--){
            if(nums[i]%2==0){
                 ans[i]=evenCnt;
                oddCnt++;
            }
            else if(nums[i]%2!=0){
                 ans[i]=oddCnt;
                evenCnt++;
            }
        }
        return ans;
    }
}