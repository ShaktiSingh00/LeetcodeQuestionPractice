class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // int n = nums.length;
        // int[] max = new int[n];
        // int[] min = new int[n];
        // max[0]=nums[0];
        // min[0]=nums[0];
        // int gMax = Math.abs(nums[0]);
        // for(int i=1;i<n;i++){
        //     max[i]=Math.max(max[i-1]+nums[i],nums[i]);
        //     min[i]=Math.min(min[i-1]+nums[i],nums[i]);

        //     gMax = Math.max(gMax, Math.max(Math.abs(max[i]), Math.abs(min[i])));
        // }
        // return gMax;
        int n = nums.length;
        // int[] max = new int[n];
        // int[] min = new int[n];
        int max=nums[0];
        int min=nums[0];
        int gMax = Math.abs(nums[0]);
        for(int i=1;i<n;i++){
            max=Math.max(max+nums[i],nums[i]);
            min=Math.min(min+nums[i],nums[i]);

            gMax = Math.max(gMax, Math.max(Math.abs(max), Math.abs(min)));
        }
        return gMax;
    }
}