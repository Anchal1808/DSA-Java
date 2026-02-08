class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
       List<Long> stack = new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            long cur = nums[i];

            while (!stack.isEmpty() && stack.get(stack.size() - 1) == cur) {
                cur += stack.remove(stack.size() - 1);
            }

            stack.add(cur);
        }

        return stack;
    }
}