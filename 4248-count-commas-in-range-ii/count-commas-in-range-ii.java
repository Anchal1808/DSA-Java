class Solution {
    public long countCommas(long n) {
           long ans=0;
        if(n>=1000){
          ans+=Math.min(n,999999L)-999;
        }
        if(n>=1000000){
            ans+=2*(Math.min(n,999999999L)-999999);
        }
        if(n>=1000000000){
            ans+=3*(Math.min(n,999999999999L)-999999999);
        }
        if(n>=1000000000000L){
            ans+=4*(Math.min(n,999999999999999L)-999999999999L);
        }
        if (n >= 1000000000000000L) {
            ans += 5 * (Math.min(n, 999999999999999999L) - 999999999999999L);
        }

        return ans;
    
    }
}