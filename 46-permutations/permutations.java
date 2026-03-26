class Solution {
    public static void permutation(int indx,int[] arr,boolean[] map,List<Integer> temp,List<List<Integer>> ans){
        if(indx==arr.length){
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(map[i]){
                continue;
            }
            temp.add(arr[i]);
            map[i]=true;
            permutation(indx+1,arr,map,temp,ans);
            //backtrack
            temp.remove(temp.size()-1);
            map[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        boolean[] map=new boolean[nums.length];
        permutation(0,nums,map,temp,ans);
        return ans;
    }
}