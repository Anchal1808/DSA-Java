class Solution {
    public int mirrorFrequency(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        Set<Character> visited = new HashSet<>();
        int result = 0;
        //  Process each unique character
        for (char c : freq.keySet()) {
            if (visited.contains(c)) continue;

            char mirror;

            //  Find mirror
            if (Character.isDigit(c)) {
                mirror = (char) ('9' - (c - '0'));
            } else {
                mirror = (char) ('z' - (c - 'a'));
            }

            int freqC = freq.getOrDefault(c, 0);
            int freqM = freq.getOrDefault(mirror, 0);

            result += Math.abs(freqC - freqM);
            visited.add(c);
            visited.add(mirror);
        }

        return result;
    }
}