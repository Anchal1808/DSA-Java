class Solution {
    public static int[] getPse(int[] arr){
        int n=arr.length;
        int[] pse= new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
           int current=arr[i];
            while(!st.isEmpty()&& current<arr[st.peek()]){
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
        int n=arr.length;
        int[] nse= new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
           int current=arr[i];
            while(!st.isEmpty()&& current<=arr[st.peek()]){
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
    public static long subarrayMin(int[] arr){
        int[] pse=getPse(arr);
        int[] nse=getNse(arr);
        long sum=0;
        for(int i=0;i<arr.length;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            sum+=right*left*arr[i];
        }
        return sum;
    }

    public static int[] getPge(int[] arr){
        int n=arr.length;
        int[] pge=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
           int current=arr[i];
            while(!st.isEmpty()&& current>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                pge[i]=-1;
            }
            else{
                pge[i]=st.peek();
            }
            st.push(i);
        }
      return pge;
    }
    public static int[] getNge(int[] arr){
        int n=arr.length;
        int[] nge=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
           int current=arr[i];
            while(!st.isEmpty()&& current>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=n;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(i);
        }
      return nge;

    }
    public static long subarrayMax(int[] arr){
        int[] pge=getPge(arr);
        int[] nge=getNge(arr);
        long sum=0;
        for(int i=0;i<arr.length;i++){
            long left=i-pge[i];
            long right=nge[i]-i;
            sum+=right*left*arr[i];
        }
        return sum;
    }

    public long subArrayRanges(int[] arr) {
        long sumMin=subarrayMin(arr);
        long sumMax=subarrayMax(arr);
        return sumMax-sumMin;
    }
}