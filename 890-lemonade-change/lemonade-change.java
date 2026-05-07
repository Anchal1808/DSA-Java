class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int cntfive=0;
        int cntTen=0;
        for(int i=0;i<n;i++){
          int currBill=bills[i];
          if(currBill==5){
            cntfive++;
          }
         else if(currBill==10){
            if(cntfive==0){
                return false;
            }
            cntfive--;
            cntTen++;
         }
         else if(currBill==20) {
            if(cntTen>0 && cntfive>0){
                cntTen--;
                cntfive--;
            }
            else if(cntfive>=3){
                cntfive-=3;
            }
            else{
                return false;
            }
         }
        }
        return true;
    }
}