class Solution {
    public int singleNonDuplicate(int[] nums) {
        // int unique = 0;
        // for(int i=0;i<nums.length;i++){
            
        // }
    //     int n = nums.length;
    //     if(n==1){
    //         return nums[0];
    //     }
    //     for(int i=0;i<n;i++){
    //     if(i==0){
    //         if(nums[i] != nums[i+1]){
    //         return nums[i];
    //         }
    //     }else if(i==n-1){
    //         if(nums[i] != nums[i-1]){
    //         return nums[i];
    //         }
    //     }
    //     else {
    //         if(nums[i] != nums[i-1] && nums[i] != nums[i+1]){
    //             return nums[i];
    //         }
    //     }
    // }
    // return -1;

      int n = nums.length;
      if(n==1){
          return nums[0];
      }
      if(nums[0] != nums[1]){
          return nums[0];
      }
      if(nums[n-1] != nums[n-2]){
          return nums[n-1];
      }
      int start=1,end=n-2;
      while(start <= end){
          int mid = (start+end)/2;
          if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
              return nums[mid];
          }
          if((mid % 2 ==1 && nums[mid] == nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1])){
              start = mid+1;
          }else{
              end=mid-1;
          }
      }
      return -1;
    }
}