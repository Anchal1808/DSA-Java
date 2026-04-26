class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int five=0;
        int ten=0;
        for(int i=0;i<n;i++){
          int currBill=bills[i];
          if(currBill==5){
            five++;
          }
         else if(currBill==10){
            if(five==0){
                return false;
            }
            five--;
            ten++;
         }
         else if(currBill==20) {
            if(ten>0 && five>0){
                ten--;
                five--;
            }
            else if(five>=3){
                five-=3;
            }
            else{
                return false;
            }
         }
        }
        return true;
    }
}