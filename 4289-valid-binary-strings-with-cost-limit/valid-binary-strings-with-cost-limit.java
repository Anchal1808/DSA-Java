class Solution {

    private void backtrack(int idx, int n, int k, int cost,
                           boolean prevOne, StringBuilder sb,
                           List<String> ans) {

        if (idx == n) {
            ans.add(sb.toString());
            return;
        }

        // Choose 0
        sb.append('0');
        backtrack(idx + 1, n, k, cost, false, sb, ans);
        sb.deleteCharAt(sb.length() - 1);

        // Choose 1
        if (!prevOne && cost + idx <= k) {
            sb.append('1');
            backtrack(idx + 1, n, k, cost + idx, true, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    } // <-- Missing brace was needed here

    public List<String> generateValidStrings(int n, int k) {
        List<String> ans = new ArrayList<>();
        backtrack(0, n, k, 0, false, new StringBuilder(), ans);
        return ans;
    }
}