class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int n = nums.length;
        //int count = 0;
        for(int i = 1;i<=n;i++){
             int count = 0;
            for(int j=0;j<n;j++){
                if(nums[j]==i){
                    count++;
                }
            }
            if(count==2){
                arr[0]=i;
            }
            if(count==0){
                arr[1] = i;
            }
        }

        return arr;
    }
}