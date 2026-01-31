class Solution {

    public static void permutation(int idx, int[] arr, List<Integer> temp ,List<List<Integer>> ans) {

        if (idx == arr.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = idx; i < arr.length; i++) {

            // swap
            int t = arr[idx];
            arr[idx] = arr[i];
            arr[i] = t;

            temp.add(arr[idx]);
            permutation(idx + 1, arr, temp, ans);

            // backtrack
            temp.remove(temp.size() - 1);

            // swap back
            t = arr[idx];
            arr[idx] = arr[i];
            arr[i] = t;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(0, nums, new ArrayList<>(), ans);
        return ans;
    }
}
