class Solution {
    public static void permutation(int[] arr,List<Integer> temp,List<List<Integer>> ans,boolean[] mp){
        if(temp.size()==arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(mp[i]){
                continue;
            }
            if (i > 0 && arr[i] == arr[i - 1] && !mp[i - 1]) {
                continue;
            }
            temp.add(arr[i]);
            mp[i]=true;
            permutation(arr,temp,ans,mp);
            //backtrack
            temp.remove(temp.size() - 1);
            mp[i] = false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
         List<Integer> temp=new ArrayList<>();
         boolean[] mp=new boolean[nums.length];
         permutation(nums,temp,ans,mp);
         return ans;
    }
}