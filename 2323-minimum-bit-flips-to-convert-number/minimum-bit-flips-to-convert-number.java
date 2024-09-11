class Solution {
    public int minBitFlips(int start, int goal) {
        int xorResult = start ^ goal;
        
        // Count the number of set bits (1s) in xorResult
        int count = 0;
        while (xorResult != 0) {
            // Increment the count for each set bit
            count += xorResult & 1;
            // Right shift xorResult to check the next bit
            xorResult >>= 1;
        }
        
        return count;
    }
}