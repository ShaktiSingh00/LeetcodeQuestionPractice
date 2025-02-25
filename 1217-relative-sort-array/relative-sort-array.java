class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
         int max = 0;
        for (int num : arr1) {
            max = Math.max(max, num);
        }

        int[] count = new int[max + 1];

        // Count occurrences of each element in arr1
        for (int num : arr1) {
            count[num]++;
        }

        int index = 0;

        // Place elements according to arr2 order
        for (int num : arr2) {
            while (count[num] > 0) {
                arr1[index++] = num;
                count[num]--;
            }
        }

        // Place remaining elements in sorted order
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr1[index++] = i;
                count[i]--;
            }
        }

        return arr1;
    }
}