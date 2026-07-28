class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long ans=0;
        long csum=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int i=0;
        int j=0;
        while(j<n){
            csum+=nums[j];
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
            if(j-i+1==k){
                if(mp.size()==k){
                    ans=Math.max(ans,csum);
                }
                csum-=nums[i];
                mp.put(nums[i],mp.get(nums[i])-1);
                if(mp.get(nums[i])==0){
                    mp.remove(nums[i]);
                }
                i++;
            }
               j++;
        }
        return ans;
    }
}