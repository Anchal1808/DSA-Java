class Solution {
    public boolean sumGame(String num) {
        int n = num.length();

        int sum = 0;
        int q = 0;

        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') {
                q++;
            } else {
                sum += num.charAt(i) - '0';
            }
        }

        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') {
                q--;
            } else {
                sum -= num.charAt(i) - '0';
            }
        }

        // q represents (#? in left - #? in right)
        // sum represents (left known sum - right known sum)

        if (q % 2 != 0) {
            return true;
        }

        return sum != -9 * (q / 2);
    }
}