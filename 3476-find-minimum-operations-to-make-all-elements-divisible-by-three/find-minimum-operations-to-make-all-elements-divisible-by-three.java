class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int res= nums[i]%3;
            sum += Math.min(res, 3 - res);
        }
        return sum;

    }
}