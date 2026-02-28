class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        List<Integer> list=new ArrayList<>(mp.keySet());
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            int x=list.get(i);
            for(int j=i+1;j<list.size();j++){
                int y=list.get(j);
                if(!mp.get(x).equals(mp.get(y))){
                    return new int[]{x,y};
                }
            }
        }
        return new int[]{-1,-1};
    }
}