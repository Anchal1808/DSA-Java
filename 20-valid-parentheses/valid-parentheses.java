class Solution {
    boolean isOpen(char ch){
        if(ch=='(' || ch=='{' || ch=='['){
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(isOpen(ch)){
            st.push(ch);
        }
        else{
            // closing ho par open nh hai
            if(st.size()==0){
                return false;
            }
             if((ch==')' && st.pop()!='(')||(ch==']' && st.pop()!='[')||(ch=='}' && st.pop()!='{')){
                    return false;
                }
                
        }
           
       }
       return st.isEmpty();
    }
}