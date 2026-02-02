class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
       if(s.length()<p.length()) return ans;
       int[] freq=new int[26];
       for(int i=0;i<p.length();i++){
        char ch=p.charAt(i);
        freq[ch-'a']++;
       }

       int l=0;
       int r=0;
       int cnt=p.length();
       while(r<s.length()){
       if (freq[s.charAt(r) - 'a'] > 0) {
                cnt--;
            }
            freq[s.charAt(r) - 'a']--;
            r++;

            if (cnt== 0) {
                ans.add(l);
            }

            if (r- l == p.length()) {
                if (freq[s.charAt(l) - 'a'] >= 0) {
                    cnt++;
                }
                freq[s.charAt(l) - 'a']++;
                l++;
            }
        }
        return ans;
       }
    
}