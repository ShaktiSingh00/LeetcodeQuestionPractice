class Solution {
    public long minimumSteps(String s) {
       
        long whiteCount = 0;  // Keeps track of the number of white balls encountered
        long steps = 0;       // Tracks the number of steps (swaps) needed
        
        // Traverse the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                // Increment the count of white balls when we encounter a '0'
                whiteCount++;
            } else  {
                // When we encounter a black ball ('1'), add the number of white balls it needs to skip
                steps += whiteCount;
            }
        }
        return steps;
    }

}