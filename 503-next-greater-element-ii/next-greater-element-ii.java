class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int [] doublearr=new int[2*n];
        for(int i=0;i<2*n;i++){
            doublearr[i]=nums[i%n];
        }
        int tempres[]=new int[2*n];
        Stack<Integer> st=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int current=doublearr[i];
            while(!st.isEmpty() && st.peek()<=current){
                st.pop();
            }
            if(st.isEmpty()){
                tempres[i]=-1;
            }
            else{
                tempres[i]=st.peek();
            }
            st.push(current);
        }
        int[] finalans=new int[n];
        for(int i=0;i<n;i++){
            finalans[i]=tempres[i];
        }
        return finalans;
            }
}