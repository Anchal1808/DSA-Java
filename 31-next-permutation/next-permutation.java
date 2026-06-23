class Solution {
    public void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            // swap arr[start] and arr[end]
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index=-1;
        // finding break point
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if (index == -1) {
            reverseArray(nums, 0, n - 1);
            return;
        }

        //no.put 
        for(int i=n-1;i>=index;i--){
            if(nums[i]>nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }
        // 3rd step after taking the slightly greater element 
        reverseArray(nums,index+1,n-1);
    }
}