class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i+1<n;i++){
            minDiff=Math.min(minDiff,arr[i+1]-arr[i]);
        }
      //  List<Integer> pair=new ArrayList<>();
        for(int i=0;i+1<n;i++){
            if(arr[i+1]-arr[i]==minDiff){
                List<Integer> pair=new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                ans.add(pair);
            }
        
        }
        return ans;
    }
}