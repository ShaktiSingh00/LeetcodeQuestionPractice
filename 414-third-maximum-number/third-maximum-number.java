class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Integer firstMax = null, secondMax = null, thirdMax = null;

        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);

                if (firstMax == null || num > firstMax) {
                    thirdMax = secondMax;
                    secondMax = firstMax;
                    firstMax = num;
                } else if (secondMax == null || num > secondMax) {
                    thirdMax = secondMax;
                    secondMax = num;
                } else if (thirdMax == null || num > thirdMax) {
                    thirdMax = num;
                }
            }
        }

        // If there are less than three distinct elements, return the maximum
        return (thirdMax != null) ? thirdMax : firstMax;
 
    }
}
         