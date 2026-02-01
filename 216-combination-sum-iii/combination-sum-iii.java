class Solution {
    public static void combination(int i,int n,int k,List<Integer> temp,List<List<Integer>> ans){
        if(i>9){
            if(n==0 && temp.size()==k){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if(temp.size()>k || n<0) return;
        //pick i as a member
        temp.add(i);
        combination(i+1,n-i,k,temp,ans);
        temp.remove(temp.size()-1);
        //not pick
        combination(i+1,n,k,temp,ans);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        combination(1,n,k,temp,ans);
        return ans;
    }
}