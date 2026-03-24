class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        if(s.length()==1) return s;
        
       int n=s.length();
       String longest="";
       for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
             int l=i;
             int r=j;
             boolean ispal=true;
             while(l<r){
                if(s.charAt(l)!=s.charAt(r)){
                    ispal=false;
                    break;
                }
                l++;
                r--;
             }
              if (ispal && (j - i + 1) > longest.length()) {
                    longest = s.substring(i, j + 1);
                }
        }
       }

        return longest;
    }
}