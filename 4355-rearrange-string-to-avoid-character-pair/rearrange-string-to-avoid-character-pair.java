class Solution {
    public String rearrangeString(String s, char x, char y) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder ans = new StringBuilder();

        // Add all other characters
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch == x || ch == y) continue;

            while (freq[ch - 'a']-- > 0) {
                ans.append(ch);
            }
        }

        // Add all y
        while (freq[y - 'a']-- > 0) {
            ans.append(y);
        }

        // Add all x
        while (freq[x - 'a']-- > 0) {
            ans.append(x);
        }

        return ans.toString();
    }
}