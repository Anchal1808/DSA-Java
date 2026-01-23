class Solution {
    public int largestRectangleArea(int[] height) {
        int n=height.length;
        Stack<Integer> st=new Stack<>();
        int maxArea=0;
        for(int i=0;i<n;i++){
            int current =height[i];
            while(!st.isEmpty() && height[st.peek()]>current){
                  int computeEle=st.peek();
                  st.pop();
                  int nse=i;
                  int pse;
                  if(st.isEmpty()){
                   pse=-1;
                  }
                  else{
                   pse=st.peek();
                  }
                  int area=height[computeEle]*(nse-pse-1);
                  maxArea=Math.max(maxArea,area);
            }
            st.push(i);
            
        }
        //remaining elements
        while(!st.isEmpty()){
          int nse=n;
          int pse;
          int computeEle=st.peek();
          st.pop();
           if(st.isEmpty()){
                  pse=-1;
                  }
                  else{
                   pse=st.peek();
                  }
           int area=height[computeEle]*(nse-pse-1);
                  maxArea=Math.max(maxArea,area);

        }
        return maxArea;
    }
}