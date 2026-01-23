class Solution {
    public static int[] getNge(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] nge=new int[n];
        for(int i=n-1;i>=0;i--){
            int current=arr[i];
            while(!st.isEmpty() &&arr[st.peek()]<=current){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=-1;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(i);
        }
        return nge;
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] nge=new int[n];
        nge=getNge(temperatures);
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nge[i]==-1){
                ans[i]=0;
            }
            else{ 
            ans[i]=nge[i]-i;
            }
        }
       return ans;
    }
}