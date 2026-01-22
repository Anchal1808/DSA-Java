class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       int n=asteroids.length;
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<n;i++){
        int current=asteroids[i];
        if(st.isEmpty() || current>0){
            st.push(current);
        }
        else{ //current is negative
        while(!st.isEmpty() && st.peek()>0 &&current<0){
            if(Math.abs(st.peek())<Math.abs(current)){
                st.pop();
                continue;
            }
            else if(Math.abs(st.peek())==Math.abs(current)){
                st.pop();
                current=0;
                break;
            }
            else{
                current=0;
                break;
            }
        }
        if(current!=0){
            st.push(current);
        }
        }
       }
       int[] ans=new int[st.size()];
       for(int i=st.size()-1;i>=0;i--){
        ans[i]=st.pop();
       }
       return ans;
    }
}