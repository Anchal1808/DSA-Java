class Solution {
    public int mirrorDistance(int n) {
       int rem=0,rev=0;
       int original=n;
       while(n!=0){
        rem=n%10;
        n=n/10;
        rev=rev*10+rem;
       }
       return Math.abs(original-rev);
    }
}