class Solution {
    public int minimumPairRemoval(int[] arr) {
        int n=arr.length;
        int cnt=0;
        // we convert array to ArrayList only because
        // array size cannot change
        ArrayList<Integer> list=new ArrayList<>();
       for(int i=0;i<n;i++){
        list.add(arr[i]);
       }
       while(true){ 
       boolean sorted=true;//ye maan ke chle array sorted hai
       for(int i=0;i<list.size()-1;i++){
        if(list.get(i)>list.get(i+1)){
            sorted=false;
            break;
        }
       }
       if(sorted) break;
        //find min adjecent pair
    
        int minsum=Integer.MAX_VALUE;
        int idx=0;
        for(int i=0;i<list.size()-1;i++){
            int sum=list.get(i)+list.get(i+1);
            if(sum<minsum){
                minsum=sum;
                idx=i;
            }
        }
           //replace i and i+1
           list.set(idx,minsum);
           list.remove(idx+1);
           cnt++;
    }
        return cnt;
    }
}