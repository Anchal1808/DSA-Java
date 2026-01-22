class Solution {
    public boolean isNonDecreasing(ArrayList<Integer> list){
        for(int i=1;i<list.size();i++){
            if(list.get(i)<list.get(i-1)){
                return false;
            }
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int val:nums){
            list.add(val);
        }
        int cntOperations=0;
        while(!isNonDecreasing(list)){ //while not true 
        int minsum=Integer.MAX_VALUE;
        int indx=0;
        for(int i=0;i+1<list.size();i++){
            int sum=list.get(i)+list.get(i+1);
            if(sum<minsum){
                minsum=sum;
                indx=i;
            }
        }
        //replace pair with sum
         list.set(indx,minsum);
         list.remove(indx+1);
         cntOperations++;
        }
        return cntOperations;
    }
}