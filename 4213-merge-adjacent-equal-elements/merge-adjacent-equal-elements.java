class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
       List<Long> stack = new ArrayList<>();

        for (int num : nums) {
            long cur = num;

            while (!stack.isEmpty() && stack.get(stack.size() - 1) == cur) {
                cur += stack.remove(stack.size() - 1);
            }

            stack.add(cur);
        }

        return stack;
    }
}