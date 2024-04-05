class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int curSum = 0;
        for(int num : nums){
            sum += num;
        }
        for(int i=0;i<n;i++){
            sum -= nums[i];

            if(sum == curSum){
                return i;
            }

            curSum += nums[i];
        }

        return -1;
    }
}