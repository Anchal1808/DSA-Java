class Solution {
    public static void partition(int i,String s,List<String> temp,List<List<String>> ans){
        if(i==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j=i;j<s.length();j++){
            if(isPalindrome(s,i,j)){
                //pick
                temp.add(s.substring(i,j+1));
                partition(j+1,s,temp,ans);
                //backtrack
                temp.remove(temp.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) {
                return false;
        }
        l++;
        r--;

        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        partition(0,s,temp,ans);
        return ans;
    }
}