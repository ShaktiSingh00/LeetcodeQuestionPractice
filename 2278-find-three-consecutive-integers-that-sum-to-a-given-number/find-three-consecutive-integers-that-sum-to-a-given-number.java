class Solution {
    public long[] sumOfThree(long num) {
        if (num % 3 != 0) {
            return new long[0];
        }
        
        // Find the middle number
        long mid = num / 3;
        
        // Return the three consecutive integers sorted
        return new long[] {mid - 1, mid, mid + 1}; 
    }
}