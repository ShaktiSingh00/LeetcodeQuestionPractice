class Solution {
    public String addStrings(String num1, String num2) {
          StringBuilder result = new StringBuilder();
        int carry = 0;

        // Pad the shorter number with zeros to make their lengths equal
        int len1 = num1.length();
        int len2 = num2.length();
        int maxLength = Math.max(len1, len2);
        num1 = String.format("%" + maxLength + "s", num1).replace(' ', '0');
        num2 = String.format("%" + maxLength + "s", num2).replace(' ', '0');

        // Iterate from right to left
        for (int i = maxLength - 1; i >= 0; i--) {
            int digitSum = Character.getNumericValue(num1.charAt(i)) +
                           Character.getNumericValue(num2.charAt(i)) +
                           carry;
            result.append(digitSum % 10);
            carry = digitSum / 10;
        }

        // If there's a carry after the loop, append it to the result
        if (carry > 0) {
            result.append(carry);
        }

        // Reverse the result and convert it to a string
        return result.reverse().toString();
    }
}