class Solution {
     public static void combination(int i,int[] arr,int target,List<Integer> temp,List<List<Integer>> ans){
        
            if(target==0){
                ans.add(new ArrayList<>(temp));
            return;
            }
        if(i==arr.length) return;
        //pick
        if(arr[i]<=target){ 
        temp.add(arr[i]);
         combination(i+1,arr,target-arr[i],temp,ans);
         temp.remove(temp.size()-1);
        }
        //not pick skip duplicate
        int j=i+1;
        while(j<arr.length && arr[j]==arr[i]){
            j++;
        }
        combination(j,arr,target,temp,ans);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        combination(0,candidates,target,temp,ans);
        return ans;
    }
}