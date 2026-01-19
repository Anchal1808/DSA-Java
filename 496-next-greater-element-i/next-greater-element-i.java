class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) { 
      //int[] ans=new int[nums1.length];
      HashMap<Integer,Integer> ngemap=new HashMap<>();
      Stack<Integer> st=new Stack<>();
      for(int i=nums2.length-1;i>=0;i--){
        int currelement=nums2[i];
        while(!st.isEmpty() && st.peek()<=currelement){
            st.pop();
        }
        int nextgreater;
        if(st.isEmpty()){
         nextgreater=-1;
        }
        else{
            nextgreater=st.peek();
        }
        ngemap.put(currelement,nextgreater);
        st.push(currelement);
      }
      int[] ans=new int[nums1.length];
      for(int i=0;i<nums1.length;i++){
        ans[i]=ngemap.get(nums1[i]);
      }
      return ans;
    }
}