class Solution {
    public String largestNumber(int[] nums) {
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }

        // Sort the strings using a custom comparator
        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare concatenated results
                return (b + a).compareTo(a + b);
            }
        });

        // If the largest number is "0", return "0"
        if (numStrs[0].equals("0")) {
            return "0";
        }

        // Build the largest number from the sorted strings
        StringBuilder largestNumber = new StringBuilder();
        for (String numStr : numStrs) {
            largestNumber.append(numStr);
        }

        return largestNumber.toString();
    }
}