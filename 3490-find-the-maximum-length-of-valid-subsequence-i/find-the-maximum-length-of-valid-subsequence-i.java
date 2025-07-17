class Solution {
    public int maximumLength(int[] nums) {
        int n=nums.length;
        int count1=0, count2=0,count3=1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                count1++;
            }else{
                count2++;
            }
        }

        int max = Math.max(count1, count2);

        int min = nums[0]%2;

        for(int i=1;i<n;i++){
            int min1 = nums[i]%2;
            if(min!= min1){
                count3++;
                min=min1;
            }
        }
        return Math.max(max, count3);
    }
}