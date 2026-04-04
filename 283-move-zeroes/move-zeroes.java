class Solution {
    public void moveZeroes(int[] arr) {
        int i=0;
        int n=arr.length;
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
                arr[i]=arr[j];
                i++;
            }
        }
        for(int k=i;k<n;k++){
            if(arr[k]!=0){
                arr[k]=0;
            }
        }
    }
}