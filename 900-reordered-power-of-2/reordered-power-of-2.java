class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] targetCount = digitCount(n); // digit frequency of n

        for (int i = 0; i < 31; i++) { // up to 2^30
            int power = 1 << i;
            if (matches(targetCount, digitCount(power))) {
                return true;
            }
        }
        return false;
    }

    // Get digit frequency array
    public int[] digitCount(int num) {
        int[] res = new int[10];
        while (num > 0) {
            res[num % 10]++;
            num /= 10;
        }
        return res;
    }

    // Compare two digit frequency arrays
    public boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 10; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
