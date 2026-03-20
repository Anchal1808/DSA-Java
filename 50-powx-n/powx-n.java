class Solution {
    public double power(double x, long binaryExpo){
        if(binaryExpo==0){
            return 1.0;
        }
        double half=power(x,binaryExpo/2);
        //for even case
        if(binaryExpo%2==0){
            return half*half;
        }
        //for odd
        else{
            return half*half*x;
        }
    }
    public double myPow(double x, int n) {
        long binaryExpo=n;
        if(n<0){
            x=1/x;
            binaryExpo=-binaryExpo;
        }
        return power(x,binaryExpo);
    }
}