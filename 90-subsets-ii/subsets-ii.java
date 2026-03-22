class Solution {
    public static void subset(int i,int[] arr,List<Integer> temp,List<List<Integer>> ans){
        if(i==arr.length){
            ans.add(new ArrayList(temp));
            return;
        }
        //pick
        temp.add(arr[i]);
        subset(i+1,arr,temp,ans);
        //backtrack
        temp.remove(temp.size()-1);
        // not pick
        int j=i+1;
        while(j<arr.length && arr[j]==arr[i]){
            j++;
        }
        subset(j,arr,temp,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        subset(0,nums,temp,ans);
        return ans;
    }
}