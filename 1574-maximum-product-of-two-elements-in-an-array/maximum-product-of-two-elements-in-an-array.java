class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
      //   int max=0;
      //  int result = 0;
        Arrays.sort(nums);
        int max = (nums[0] - 1) * (nums[1] - 1);

        for(int i=2;i<n;i++){
            int result= (nums[i]-1) * (nums[i-1]-1);
            max=Math.max(result,max);

        }
        return max;
    }
}