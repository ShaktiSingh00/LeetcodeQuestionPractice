class Solution {
    public int minPairSum(int[] nums) {
        int n= nums.length;

        Arrays.sort(nums);

        int start = 0;
        int end = n-1;
        int max = Integer.MIN_VALUE;

        while(start<end){
            int sum = nums[start]+nums[end];
            max = Math.max(max, sum);
            start++;
            end--;
        }
        return max;
    }
}