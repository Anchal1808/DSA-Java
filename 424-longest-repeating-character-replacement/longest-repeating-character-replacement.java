class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int i=0;
        int j=0;
        int[] freq=new int[26];
        int maxlen=0;
        int maxfreq=0;
        while(j<n){
            freq[s.charAt(j)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(j)-'A']);
        while((j-i+1)-maxfreq>k){
                 freq[s.charAt(i)-'A']--;
                maxfreq=0;
                for(int l=0;l<26;l++){
                    maxfreq=Math.max(maxfreq,freq[l]); 
            
                }
                i++;
            }
            if((j-i+1)-maxfreq<=k){
                maxlen=Math.max(maxlen,j-i+1);
            }
            j++;
        }
        return maxlen; 
    }
}