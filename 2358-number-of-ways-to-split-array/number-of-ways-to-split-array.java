class Solution {
    public int waysToSplitArray(int[] nums) {
        // int n=nums.length;
        // int i=0,j=n-1;
        // int count=0;
        // int sum=0,sum1=0;
        // while(i<j){
        //     sum += nums[i];

        //     sum1 += nums[j];
        //     if(sum>=sum1){
        //         count++;
        //     }
        //     i++;
        //     j--;
        // }
        // return count;
          int n = nums.length;
        long totalSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        int count = 0;

        // Iterate through the array and check for valid splits
        for (int i = 0; i < n - 1; i++) {
            leftSum += nums[i];
            long rightSum = totalSum - leftSum;
            
            if (leftSum >= rightSum) {
                count++;
            }
        }

        return count;
    }
}