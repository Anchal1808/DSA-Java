class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        if(k>=n) return "0";
        Stack<Character> st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=num.charAt(i);
            while(!st.isEmpty()&&k>0&&st.peek()>ch){
                st.pop();
              k--;
                
            }
            st.push(ch);
            
        }
         while(k>0&&!st.isEmpty()){
                st.pop();
                k--;
            }
        while(!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }
         ans.reverse();
        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }
        return ans.length()==0 ? "0" :ans.toString();
    }
}