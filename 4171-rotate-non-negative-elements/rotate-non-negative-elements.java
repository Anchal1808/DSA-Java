class Solution {
    public static void reverse(int arr[],int l,int r){
        while(l<r){
            int temp=arr[r];
            arr[r]=arr[l];
            arr[l]=temp;
            l++;
            r--;}
    }
    public static void reverseArray(int arr[],int k){
        int n=arr.length;
        if(n==0) return;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public int[] rotateElements(int[] nums, int k) {
        int n=nums.length;
        if(n==0) return nums;
    ArrayList<Integer> nonNegative=new ArrayList<>();
        //add all non-negative to arr
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                nonNegative.add(nums[i]);
                                 }
        }
        int []arr=new int[nonNegative.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=nonNegative.get(i);
        }
        //now call reverse the non-negative array
            reverseArray(arr,k);
        int result[]=new int[nums.length];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                result[i]=arr[idx++];
            }else{
                result[i]=nums[i];
            }
        }
        return result;
        
    }
}