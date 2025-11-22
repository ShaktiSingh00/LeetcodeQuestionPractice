class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int res= nums[i]%3;
            if(res==1){
                nums[i]=nums[i]-1;
                count++;
            }else if(res==2){
                nums[i]=nums[i]+1;
                count++;
            }else{
                count +=0;
            }
        }
        return count;

    }
}