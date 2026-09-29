class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] res = new int[k];
        int index=0;

        for(int i=n-k;i<n;i++){
            res[index++]=nums[i];
        }

        for(int j=n-k-1;j>=0;j--){
            nums[j+k]=nums[j];
        }

        for(int i=0;i<k;i++){
            nums[i]=res[i];
        }
    }
}