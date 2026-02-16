class Solution {
    public boolean isAnagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public List<String> removeAnagrams(String[] words) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(st.isEmpty()){
                st.push(word);
            }
            else{
                if(isAnagram(st.peek(),word)){
                    continue;
                }
                else{
                    st.push(word);
                }
            }
        }
        return new ArrayList<>(st);
    }
}