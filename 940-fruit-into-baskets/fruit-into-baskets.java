class Solution {
    public int totalFruit(int[] fruits) {
        int maxlen=0;
        int n=fruits.length;
        int i=0;
        int j=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while(j<n){
            mp.put(fruits[j],mp.getOrDefault(fruits[j],0)+1);
            if(mp.size()>2){
               while(mp.size()>2){
                mp.put(fruits[i],mp.get(fruits[i])-1);
                if(mp.get(fruits[i])==0){
                    mp.remove(fruits[i]);
                }
                i++;
               } 
            }
            if(mp.size()<=2){
                maxlen=Math.max(maxlen,j-i+1);
            }
          j++;
        }
        return maxlen;

    }
}