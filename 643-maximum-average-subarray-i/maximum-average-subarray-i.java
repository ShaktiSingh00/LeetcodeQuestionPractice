class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double max = Integer.MIN_VALUE;
        int i=0,j=0;
        int sum = 0;
        double avg = 0;
        while(j<n){
            sum += nums[j];
            avg = (double)sum/k;

            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                max = Math.max(avg,max);
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return max;
    }
}