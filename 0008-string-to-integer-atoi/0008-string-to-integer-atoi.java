class Solution {
    public int myAtoi(String s) {

        int ans = 0;
        int sign = 1;
        int i = 0;

        // Skip spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Check sign
        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        // Read digits
        for (; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {

                int digit = ch - '0';

                // Overflow
                if (ans > (Integer.MAX_VALUE - digit) / 10) {
                    return sign == 1
                            ? Integer.MAX_VALUE
                            : Integer.MIN_VALUE;
                }

                ans = ans * 10 + digit;

            } else {
                break;
            }
        }

        return ans * sign;
    }
}