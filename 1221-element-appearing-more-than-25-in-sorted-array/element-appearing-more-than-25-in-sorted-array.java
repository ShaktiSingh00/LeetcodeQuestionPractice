import java.util.HashMap;

class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        // Populate the hashmap with frequency counts
        for (int i = 0; i < arr.length; i++) {
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
        }
        
        // Determine the threshold frequency
        int n = arr.length / 4;
        
        // Check for the special integer
        for (int i = 0; i < arr.length; i++) {
            if (hmap.get(arr[i]) > n) {
                return arr[i];
            }
        }
        
        // If no special integer is found, return -1 or any other appropriate value
        return -1;
    }
}
