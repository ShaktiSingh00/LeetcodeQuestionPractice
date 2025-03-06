class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] count = new int[size + 1]; // To track occurrences of numbers
        int repeating = -1, missing = -1;
        
        // Count occurrences of numbers in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }

        // Identify the repeating and missing numbers
        for (int i = 1; i <= size; i++) {
            if (count[i] == 2) repeating = i;
            else if (count[i] == 0) missing = i;
        }

        return new int[]{repeating, missing};
    }
}