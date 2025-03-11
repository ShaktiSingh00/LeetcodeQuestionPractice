class Solution {
    public int numberOfSubstrings(String s) {
         int n = s.length();
        // int[] count = new int[3]; // To track occurrences of 'a', 'b', and 'c'
        // int left = 0, result = 0;

        // for (int right = 0; right < n; right++) {
        //     count[s.charAt(right) - 'a']++; // Add current character to window
            
        //     while (count[0] > 0 && count[1] > 0 && count[2] > 0) { // Valid window found
        //         result += n - right; // All substrings from [left, right] to [left, n-1] are valid
        //         count[s.charAt(left) - 'a']--; // Shrink the window from left
        //         left++;
        //     }
        // }
        
        // return result;
        HashMap<Character, Integer> hmap = new HashMap<>();
        int left = 0,result=0;
        for(int right=0;right<n;right++){
            hmap.put(s.charAt(right),hmap.getOrDefault(s.charAt(right),0)+1);
            while(hmap.containsKey('a') && hmap.containsKey('b') && hmap.containsKey('c')){
                result += n-right;
                hmap.put(s.charAt(left),hmap.get(s.charAt(left))-1);
                if (hmap.get(s.charAt(left)) == 0) {
                    hmap.remove(s.charAt(left)); // Remove character if count becomes 0
                }
                left++;
            }
        }
        return result;
    }
}