class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int num : nums1) {
            if (num % 2 == 0) {
                minEven = Math.min(minEven, num);
            } else {
                minOdd = Math.min(minOdd, num);
            }
        }

        // 1. Can we make all elements EVEN?
        //    Odd elements need a smaller ODD element to become even.
        //    The smallest odd element (minOdd) can NEVER become even because no odd element is smaller than it.
        //    So, all-even is only possible if there are NO odd elements at all.
        boolean canMakeEven = (minOdd == Integer.MAX_VALUE);

        // 2. Can we make all elements ODD?
        //    Even elements need a smaller ODD element to become odd.
        //    This is possible if minOdd < minEven (or if there are no even elements).
        boolean canMakeOdd = (minEven == Integer.MAX_VALUE) || (minOdd < minEven);

        return canMakeEven || canMakeOdd;
    }
}