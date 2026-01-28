class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr =new ArrayList<>();
        helper(0,nums,curr,ans);
        return ans;
    }
    void helper(int i,int[] nums,List<Integer> curr, List<List<Integer>> ans){
        //base case
        if(i>=nums.length){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        // pick
        curr.add(nums[i]);
         helper(i+1,nums,curr,ans);
        //backtrack
         curr.remove(curr.size()-1);
           
         //not pick skip all duplicates
         int j=i+1;
         while(j<nums.length && nums[j]==nums[i]){
            j++;
         }
         
         helper(j,nums,curr,ans);


    }
}