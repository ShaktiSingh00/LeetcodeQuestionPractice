class Solution {
    public long[] sumOfThree(long num) {
        // if (num % 3 != 0) {
        //     return new long[0];
        // }
        
        // // Find the middle number
        // long mid = num / 3;
        
        // // Return the three consecutive integers sorted
        // return new long[] {mid - 1, mid, mid + 1}; 
        long low = 0;
        long high = num;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long sum = 3 * mid; // The sum of (mid-1) + mid + (mid+1) is always 3 * mid
            
            if (sum == num) {
                return new long[] {mid - 1, mid, mid + 1};
            } else if (sum < num) {
                low = mid + 1; // Look in the upper half
            } else {
                high = mid - 1; // Look in the lower half
            }
        }
        
        // If the loop finishes without finding a valid mid, no such integers exist
        return new long[0];
    }
}