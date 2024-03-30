class Solution {
    public void rotate(int[] nums, int k) {
    if(nums.length <=1)
      {
          return;
      }
        int step=k%nums.length;
        int[] arr1=new int[step];

        for(int i=0;i<step;i++)
        {
            arr1[i]=nums[nums.length-step+i];

        }
        for(int i=nums.length-step-1;i>=0;i--)
        {
            nums[i+step]=nums[i];
        }
        for(int i=0;i<step;i++)
        {
            nums[i]=arr1[i];
        }
        
        }
    
}