class Solution {
    public int minOperations(String s) {
        int n = s.length();
        
        // Initialize counts for assuming the string starts with '0' and '1'
        int countStartWithZero = 0;
        int countStartWithOne = 0;

        // Iterate through the string assuming it starts with '0'
        for (int i = 0; i < n; i++) {
            // If the expected character is not '0', increment the count
            if (i % 2 == 0 && s.charAt(i) != '0') {
                countStartWithZero++;
            } else if (i % 2 == 1 && s.charAt(i) != '1') {
                countStartWithZero++;
            }
        }

        // Iterate through the string assuming it starts with '1'
        for (int i = 0; i < n; i++) {
            // If the expected character is not '1', increment the count
            if (i % 2 == 0 && s.charAt(i) != '1') {
                countStartWithOne++;
            } else if (i % 2 == 1 && s.charAt(i) != '0') {
                countStartWithOne++;
            }
        }

        // Return the minimum of the two counts
        return Math.min(countStartWithZero, countStartWithOne);
    }
}
