class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] arr1 = Arrays.copyOf(arr, n); // Create a copy of arr to preserve the original array
        Arrays.sort(arr1); // Sort the copied array

        HashMap<Integer, Integer> hmap = new HashMap<>();
        int rank = 1;

        // Assign ranks to unique elements in sorted order
        for (int i = 0; i < n; i++) {
            if (!hmap.containsKey(arr1[i])) {
                hmap.put(arr1[i], rank++);
            }
        }

        // Create result array using the rank map
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = hmap.get(arr[i]);
        }

        return res;
    }
}