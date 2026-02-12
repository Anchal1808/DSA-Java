class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i=0;
        int j=0;
        int maxlen=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        while(j<n){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            if(mp.size()<j-i+1){
                mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                if(mp.get(s.charAt(i))==0){
                    mp.remove(s.charAt(i));
                }
                i++;
            }
            if(mp.size()==j-i+1){
                maxlen=Math.max(maxlen,j-i+1);
            }
            j++;
        }
        return maxlen;
    }
}