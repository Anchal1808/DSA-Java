class Solution {
    public static void subSet(int i,int[] arr,List<Integer> temp,List<List<Integer>> ans){
        if(i>=arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //pick
        temp.add(arr[i]);
        subSet(i+1,arr,temp,ans);
        //backtrack
        temp.remove(temp.size()-1);
        //not pick
        subSet(i+1,arr,temp,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        subSet(0,nums,temp,ans);
        return ans;

    }
}