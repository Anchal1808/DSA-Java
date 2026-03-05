class Solution {
    public int totalFruit(int[] nums) {
         int n=nums.length;
        int maxlen=0;
       int i=0;
       int j=0;
       HashMap<Integer,Integer> mp=new HashMap<>();
       while(j<n){
        mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
        if(mp.size()>2){
            while(mp.size()>2){
               // mp(nums[i]--);
               mp.put(nums[i], mp.get(nums[i]) - 1);

                if(mp.get(nums[i])==0){
                    mp.remove(nums[i]);
                    //i++;
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