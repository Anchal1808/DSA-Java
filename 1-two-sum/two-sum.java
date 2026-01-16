class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] a =new int[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //              a[0]=i;
        //              a[1]=j;
        //         }
        //     }
        // }
        // return a;

         HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int need = target - nums[i];

            if(map.containsKey(need)){
                return new int[]{ map.get(need), i };
            }

            map.put(nums[i], i);
        }
        return new int[]{};
}
}