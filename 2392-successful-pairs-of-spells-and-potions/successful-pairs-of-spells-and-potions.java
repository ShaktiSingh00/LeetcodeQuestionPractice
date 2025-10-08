class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
         Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            long spell = spells[i];
            // Minimum potion strength needed to reach success
            long required = (success + spell - 1) / spell;  // ceil division

            int index = binarySearch(potions, required);
            result[i] = m - index;  // all potions after this index are successful
        }

        return result;
    }

    // Find first index in potions[] where potion >= required
    private static int binarySearch(int[] potions, long required) {
        int left = 0, right = potions.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (potions[mid] < required) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    
    }
}