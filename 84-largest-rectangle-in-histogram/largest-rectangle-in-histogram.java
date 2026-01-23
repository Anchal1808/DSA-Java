class Solution {
    public static int[] findPse(int[] arr){
        int n=arr.length;
        int[] pse=new int[n];
        Stack<Integer> st=new Stack<>();
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
    public static int[] findNse(int[] arr){
        int n=arr.length;
        int[] nse=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int current=arr[i];
            while(!st.isEmpty() && arr[st.peek()]>=current){
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
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] pse=new int[n];
        int[] nse=new int[n];
        pse=findPse(heights);
        nse=findNse(heights);
        int max=0;
        for(int i=0;i<n;i++){
            int area=heights[i]*(nse[i]-pse[i]-1);
            max=Math.max(max,area);
        }
        return max;

    }
}