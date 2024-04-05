class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] sortedArr = Arrays.copyOf(arr, n); // Create a copy of arr to preserve the original array
        Arrays.sort(sortedArr); // Sort the copied array

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        // Assign ranks to unique elements in sorted order
        for (int i = 0; i < n; i++) {
            if (!rankMap.containsKey(sortedArr[i])) {
                rankMap.put(sortedArr[i], rank++);
            }
        }

        // Create result array using the rank map
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = rankMap.get(arr[i]);
        }

        return res;
    }
}