class Solution {
    public boolean checkPalindrome(String s,int low,int high){
        int len=high-low+1;
        if(len==0 ||len==1){
            return true;
        }

         // skip non-alphanumeric from left
        if(!Character.isLetterOrDigit(s.charAt(low))){
            return checkPalindrome(s, low + 1, high);
        }

        // skip non-alphanumeric from right
        if(!Character.isLetterOrDigit(s.charAt(high))){
            return checkPalindrome(s, low, high - 1);
        }

        if(Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))){
            return false;
        }
        return checkPalindrome(s,low+1,high-1);
    }
    public boolean isPalindrome(String s) {
        return checkPalindrome(s,0,s.length()-1);
    }
}