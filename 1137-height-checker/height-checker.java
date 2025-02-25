class Solution {
    public int heightChecker(int[] heights) {
         int n = heights.length;
        int[] res = Arrays.copyOf(heights, n); // Correctly copying the whole array

        Arrays.sort(res); // Sorting the copied array

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != res[i]) { // Count mismatches, not matches
                count++;
            }
        }
        return count;
    }
}