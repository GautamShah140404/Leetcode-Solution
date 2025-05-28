class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        // Remove leading whitespaces
        s = s.trim();
        if (s.length() == 0) return 0;

        int index = 0, sign = 1, total = 0;

        // Handle signs
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }

        // Convert number and avoid overflow
        while (index < s.length()) {
            char c = s.charAt(index);
            if (!Character.isDigit(c)) break;

            int digit = c - '0';

            // Check for overflow
            if (total > (Integer.MAX_VALUE - digit) / 10)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = total * 10 + digit;
            index++;
        }

        return total * sign;
    }
}
