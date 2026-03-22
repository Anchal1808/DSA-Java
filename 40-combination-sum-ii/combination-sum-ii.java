class Solution {
    public static void combination(int i,int[] arr,int sum,List<Integer> temp,List<List<Integer>> ans){
        if(sum==0){
            ans.add(new ArrayList(temp));
            return;
        }
        if(i==arr.length){
            return;
        }
        if(sum>=arr[i]){
            temp.add(arr[i]);
            combination(i+1,arr,sum-arr[i],temp,ans);
            temp.remove(temp.size()-1);
        }
        int j=i+1;
        while(j<arr.length && arr[j]==arr[i]){
            j++;
        }
        combination(j,arr,sum,temp,ans);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        combination(0,candidates,target,temp,ans);
        return ans;
    }
}