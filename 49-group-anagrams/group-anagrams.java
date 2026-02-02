class Solution {
    public static  boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        char[] a=new char[s1.length()];
        char[] b=new char[s2.length()];
        for(int i=0;i<s1.length();i++){
           a[i]= s1.charAt(i);
             b[i]= s2.charAt(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        boolean[] used=new boolean[n];
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(used[i]) {
                continue;
            }
            List<String> grp=new ArrayList<>();
            grp.add(strs[i]);
            used[i]=true;
            for(int j=i+1;j<n;j++){
                if(!used[j]&& isAnagram(strs[i],strs[j])){
                       grp.add(strs[j]);
                       used[j]=true;
                }
            }
            ans.add(grp);
        }
       return ans;
    }
}