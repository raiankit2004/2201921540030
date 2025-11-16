class Solution {
    public int numSub(String s) {
        long ans = 0;
        long count = 0;
        int mod = 1_000_000_007;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                ans = (ans + (count * (count + 1)) / 2) % mod;
                count = 0;
            }
        }

        // handle final block of 1s
        ans = (ans + (count * (count + 1)) / 2) % mod;

        return (int) ans;
    }
}
