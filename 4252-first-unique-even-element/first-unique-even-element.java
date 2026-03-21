class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            }
        }
    //     for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
    //         if (entry.getValue() == 1) {
    //             ans.add(entry.getKey());
    //         }
    //     }
    //    if(ans.size()==0){
    //     return -1;
    //    }
    //    return ans.get(0);

     for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && mp.get(nums[i]) == 1) {
                return nums[i];
            }
        }
   return -1;
    }
}