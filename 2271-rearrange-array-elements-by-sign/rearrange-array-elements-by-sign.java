class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length; 
        int[] a = new int[n];

        int pos=0;
        int neg=1;

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                a[pos] = nums[i];
                pos = pos+2;
            }
            else {
                a[neg] = nums[i];
                neg = neg+2;
            }
        }

        return a;
        // for(int i=0;i<n;i++){
        //     if(nums[i]>0){
        //         arr1[i]=nums[i];
        //     }
        //     else{
        //         arr2[i]=nums[i];
        //     }

        // }
        // for(int i=0;i<n/2;i++){
        //     a[2*i] = arr1[i];
        //     a[2*i+1] = arr2[i];
        // }

        // return a;
    }
}