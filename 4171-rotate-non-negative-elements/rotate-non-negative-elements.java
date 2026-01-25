class Solution {
    public static ArrayList<Integer>  reverseArray(ArrayList<Integer> list,int start,int end){
        while(start<end){
            int temp=list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
        return list;
    }
    public int[] rotateElements(int[] nums, int k) {
        int n=nums.length;
        if(k==0 || n==0) return nums;
        ArrayList<Integer> posElement=new ArrayList<>();
        ArrayList<Integer> posIndx=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                posElement.add(nums[i]);
                posIndx.add(i);
            }
        }
        int m=posElement.size();
        if(m==0) return nums;

        k=k%m;
        // left rotate using reverse method
        reverseArray(posElement,0,k-1);
        reverseArray(posElement,k,m-1);
        reverseArray(posElement,0,m-1);
        //place back to original indx
        for(int i=0;i<posIndx.size();i++){
            nums[posIndx.get(i)]=posElement.get(i);
        }
        return nums;

    }
}