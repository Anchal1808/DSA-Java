class Solution {
    int gcd(int odd,int even,int n){
        int gcd=1;
        for(int j=2;j<=n;j++){ 
        if(odd%j==0 && even%j==0){
            gcd=j;
        }
        }
        return gcd;
    }
    public int gcdOfOddEvenSums(int n) {
        int num=1;
        int oddSum=0;
        int evenSum=0;
        int temp=2*n;
        while(temp>0){
            if(num%2==0){
                evenSum+=num;
                num++;
            }
            else{
                oddSum+=num;
                num++;

            }
            temp--;
        }
          return gcd(oddSum,evenSum,n);
    }
}