class Solution {
    public int myAtoi(String s) {
        s = s.trim();  // remove leading/trailing spaces
        if (s.isEmpty()) return 0;

        int sign = 1, i = 0;
        long result = 0;

        // Handle sign
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            i++;
        }

        // Process digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // Handle overflow
            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }

        return (int)(sign * result);
    }
}
