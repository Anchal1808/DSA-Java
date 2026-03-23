class Solution {
    public static void permutation(boolean[] mp,int[] arr,List<Integer> temp,List<List<Integer>> ans){
         if(temp.size()==arr.length){
            ans.add(new ArrayList(temp));
            return;
         }
         for(int i=0;i<arr.length;i++){
            if(mp[i]){
                continue;
            }
            temp.add(arr[i]);
            mp[i]=true;
            permutation(mp,arr,temp,ans);
            //backtrack
            temp.remove(temp.size()-1);
            mp[i]=false;
         }
         
    }
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>();
         boolean[] mp=new boolean[nums.length];
        List<Integer> temp=new ArrayList<>();
        permutation(mp,nums,temp,ans);
        return ans;
    }
}