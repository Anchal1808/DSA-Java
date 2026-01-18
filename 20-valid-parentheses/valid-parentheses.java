class Solution {
    public boolean isOpening(char ch){
        return ch=='(' || ch=='{' || ch=='[';
    }
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isOpening(ch)){
                st.push(ch);
              
            }
            else{
                if(st.size()==0) return false;
                if((ch==')' && st.pop()!='(')||(ch==']' && st.pop()!='[')||(ch=='}' && st.pop()!='{')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}