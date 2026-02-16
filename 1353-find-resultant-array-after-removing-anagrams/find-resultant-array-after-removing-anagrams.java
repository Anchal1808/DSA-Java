class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans=new ArrayList<>();
        int[] prev=new int[26];
        for(int i=0;i<words.length;i++){
            int[] curr=new int[26];
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                curr[ch- 'a']++;
            }
            if(!Arrays.equals(curr,prev)){
                ans.add(words[i]);
                prev=curr;
            }

        }
        return ans;
    }
}