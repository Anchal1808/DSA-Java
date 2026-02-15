class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[] st =new boolean[101];
        for(int b:bulbs){
            st[b]=!st[b];
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=100;i++){
            if(st[i]){
                ans.add(i);
            }
        }
         return ans;   
    }
}