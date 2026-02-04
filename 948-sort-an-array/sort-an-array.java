class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }

    private int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr; // base case

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int n = left.length + right.length;
        int[] result = new int[n];

        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while(i < left.length) result[k++] = left[i++];
        while(j < right.length) result[k++] = right[j++];

        return result;
    }
}
