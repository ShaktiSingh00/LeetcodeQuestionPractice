class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;

        if (n < 4) return false;

        int i = 1;

        // 1️⃣ Strictly increasing: nums[0...p]
        while (i < n && nums[i] > nums[i - 1]) {
            i++;
        }

        // p must NOT be 0 AND must NOT reach end
        if (i == 1 || i == n) return false;

        // 2️⃣ Strictly decreasing: nums[p...q]
        while (i < n && nums[i] < nums[i - 1]) {
            i++;
        }

        // q must NOT be p AND must NOT reach end
        if (i == 1 || i == n) return false;

        // 3️⃣ Strictly increasing again: nums[q...n-1]
        while (i < n && nums[i] > nums[i - 1]) {
            i++;
        }

        // if we consumed the entire array, it's trionic
        return i == n;
    }
}
