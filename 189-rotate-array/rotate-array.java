class Solution {
    public static int[] reverseArray(int[] arr,int startindx,int lastindx){
        while(startindx<lastindx){
            int temp=arr[startindx];
            arr[startindx]=arr[lastindx];
            arr[lastindx]=temp;
            startindx++;
            lastindx--;
        }
        return arr;
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if(k==0 || n==0) return;
        reverseArray(nums,0,n-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n-1);
    }
}