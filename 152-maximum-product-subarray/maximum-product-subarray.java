class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        // int ans=Integer.MIN_VALUE;
        // int prefix=1,suffix=1;
        // for(int i=0;i<n;i++)
        // {
        //     if(prefix==0)
        //     {
        //         prefix=1;
        //     }
        //     if(suffix==0)
        //     {
        //         suffix=1;
        //     }
        //     prefix=prefix*nums[i];
        //     suffix=suffix*nums[n-i-1];
        //     ans=Math.max(ans,Math.max(suffix,prefix));
        // }
        // return ans;
        int suffix=1;
        int prefix =1;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(suffix == 0){
                suffix=1;
            }
            if(prefix == 0){
                prefix=1;
            }
            
            suffix = suffix * nums[i];
            prefix = prefix * nums[n-i-1];
            max = Math.max(max,Math.max(suffix, prefix));
        }
        
        return max;
    }
}