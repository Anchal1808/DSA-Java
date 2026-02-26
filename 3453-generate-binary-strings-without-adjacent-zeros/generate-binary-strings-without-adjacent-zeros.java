class Solution {
     private void backtrack(int n, StringBuilder current, List<String> result) {
        // Base case
        if (current.length() == n) {
            result.add(current.toString());
            return;
        }
        
        // Always allowed to add '1'
        current.append('1');
        backtrack(n, current, result);
        current.deleteCharAt(current.length() - 1);
        
        // Add '0' only if previous char is not '0'
        if (current.length() == 0 || current.charAt(current.length() - 1) != '0') {
            current.append('0');
            backtrack(n, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n, new StringBuilder(), result);
        return result;
    }
}