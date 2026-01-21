class Solution {
    public static int[] getPse(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] pse=new int[n];
       for(int i=0;i<n;i++){
        int current=arr[i];
        while(!st.isEmpty() && arr[st.peek()]>current){
           st.pop();
        }
        if(st.isEmpty()){
            pse[i]=-1;
        }
        else{
            pse[i]=st.peek();
        }
        st.push(i);
       }
       
       return pse;
    }
    public static int[] getNse(int[] arr){
        Stack<Integer> st=new Stack<>();
         int n=arr.length;
        int[] nse=new int[n];
        for(int i=n-1;i>=0;i--){
            int current=arr[i];
            while(!st.isEmpty()&& arr[st.peek()]>=current){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
            }
            else{
                nse[i]=st.peek();
                
            }
            st.push(i);
        }
        return nse;
    }
    public int sumSubarrayMins(int[] arr) {
         long sum=0;
         int n=arr.length;
         int mod=1_000_000_007;
         int[] pse=getPse(arr);
         int[] nse=getNse(arr);
        for(int i=0;i<n;i++){
           long left=i-pse[i];
           long right=nse[i]-i;
          long tsum=(left*right*arr[i]) % mod;
            sum=(sum+tsum) % mod;
        }
        return (int)sum;
    }
}



//brute force apporach
// int  sum=0;
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //     int min=arr[i];
        //     for(int j=i;j<n;j++){
        //         min=Math.min(min,arr[j]);
        //         sum+=min;
        //     }
        // }
        // return sum;
