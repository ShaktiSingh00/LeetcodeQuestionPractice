class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(sumOfDigit(nums[i])==i){
                return i;
            }
        }
        return -1;
    }

    public int sumOfDigit(int res){
        int sum=0;
        while(res>0){
            int rem = res%10;
            sum += rem;
            res = res/10;
        }
        return sum;
    }
}