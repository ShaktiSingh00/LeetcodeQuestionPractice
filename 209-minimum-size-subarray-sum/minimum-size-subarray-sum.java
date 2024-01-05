class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int currSum=0,window=Integer.MAX_VALUE;
        // int start=0,end=0;
        // for(end=0;end<nums.length;end++)
        // {
        //      currSum += nums[end];
        //     while(currSum >= target)
        //     {
        //         window=Math.min(window,end-start+1);
        //         currSum -= nums[start];
        //         start++;
        //     }
        // }

        // return window ==Integer.MAX_VALUE ? 0 : window;
        int i=0,j=0,sum=0;
        int window = Integer.MAX_VALUE;
        int n = nums.length;
        while(j<n){
            sum += nums[j];

            while (sum >= target) {
                window = Math.min(window, j - i + 1);
                sum -= nums[i];
                i++;
            }

            j++;
        }
                return window == Integer.MAX_VALUE ? 0 : window;

    }
}