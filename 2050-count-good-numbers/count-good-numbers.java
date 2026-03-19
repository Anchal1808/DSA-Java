class Solution {
    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;

        long evenPart = power(5, evenCount);
        long oddPart = power(4, oddCount);

        return (int)((evenPart * oddPart) % MOD);
    }

    private long power(long base, long exp) {
        long result = 1;
        base = base % MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp = exp >> 1;
        }
        return result;
    }
}