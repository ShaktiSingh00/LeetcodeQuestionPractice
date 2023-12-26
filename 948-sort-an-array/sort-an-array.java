class Solution {
    public int[] sortArray(int[] nums) {
// //         /* Arrays.sort(nums);
// //         return nums; */
      
// //         // Bubble Sort
// //      /*   int n=nums.length;
// //         for(int i=0;i<n;i++){
// //           for(int j=0; j<n-i-1;j++){
// //             if(nums[j]>nums[j+1]){
// //               swap(nums,j,j+1);
// //             }
// //           }
// //         }
// //         return nums;
// //     }
// //     public void swap(int[] arr, int i, int j){
// //       int temp=arr[i];
// //       arr[i] =arr[j];
// //       arr[j]=temp;
// //     }*/

// //     //Selection SOrt
// //     /* int n=nums.length;
// //      for(int i=0;i<n;i++){
// //        int min_idx=i;
// //        for(int j=i+1 ;j<n;j++){
// //          if(nums[j]<nums[min_idx]){
// //            min_idx = j;
// //          }
// //        }
// //         int temp = nums[min_idx]; 
// //             nums[min_idx] = nums[i]; 
// //             nums[i] = temp; 
// //      }
// //       return nums; */


// // // Insertion sort 
// //     //  int n=nums.length;
// //     //  //int min = Integer.MIN_VALUE;

// //     //  for(int i=1;i<n;i++){
// //     //    int key=nums[i];
// //     //    int j=i-1;
// //     //    // min = Math.min(min, nums[i]);
// //     //     while(j>=0 && nums[j]>key){
// //     //       nums[j+1]=nums[j];
// //     //       j--;
// //     //     }

// //     //     nums[j+1]=key;

// //     //  }
// //     //   return nums;

// //     //  
// //     int n=nums.length;
// //     int low = 0;
// //     int high = n-1;
// //     while(low < high){
// //         int pidx = partition(arr,low, high);
// //         q
// //     }
//       int n = nums.length;
//       int left = 0;
//       int right = n-1;
//       while(left < right){
//           int part = partition(nums,left ,right);
//            return sortArray(nums, left , part-1);
//            return sortArray(nums, part+1, right);
//       }
      int n = nums.length;
      Queue<Integer> pq = new PriorityQueue<>();
      for(int no : nums){
          pq.add(no);
      }
      for(int i=0;i<n;i++){
          nums[i] = pq.poll();
      }
      return nums;

    }
}