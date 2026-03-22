class Solution {
    public void combination(int i,int[] arr,int target,List<Integer> temp,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList(temp));
            return;
            
        }
        if(i==arr.length){
            return;
        }
        
        //pick
        if(target>=arr[i]){
            temp.add(arr[i]);
            combination(i,arr,target-arr[i],temp,ans);
             temp.remove(temp.size()-1);
        }
       
        //notpick
        combination(i+1,arr,target,temp,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        combination(0,candidates,target,temp,ans);
        return ans;
    }
}