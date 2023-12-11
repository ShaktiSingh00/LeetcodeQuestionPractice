class Solution {
    public int[] sortArray(int[] nums) {
        /* Arrays.sort(nums);
        return nums; */
      
        // Bubble Sort
     /*   int n=nums.length;
        for(int i=0;i<n;i++){
          for(int j=0; j<n-i-1;j++){
            if(nums[j]>nums[j+1]){
              swap(nums,j,j+1);
            }
          }
        }
        return nums;
    }
    public void swap(int[] arr, int i, int j){
      int temp=arr[i];
      arr[i] =arr[j];
      arr[j]=temp;
    }*/

    //Selection SOrt
    /* int n=nums.length;
     for(int i=0;i<n;i++){
       int min_idx=i;
       for(int j=i+1 ;j<n;j++){
         if(nums[j]<nums[min_idx]){
           min_idx = j;
         }
       }
        int temp = nums[min_idx]; 
            nums[min_idx] = nums[i]; 
            nums[i] = temp; 
     }
      return nums; */


// Insertion sort 
    //  int n=nums.length;
    //  //int min = Integer.MIN_VALUE;

    //  for(int i=1;i<n;i++){
    //    int key=nums[i];
    //    int j=i-1;
    //    // min = Math.min(min, nums[i]);
    //     while(j>=0 && nums[j]>key){
    //       nums[j+1]=nums[j];
    //       j--;
    //     }

    //     nums[j+1]=key;

    //  }
    //   return nums;

      int n=nums.length;
      if(n==1){
          return nums;
      }
      int mid = n/2;
      int[] left = sortArray(Arrays.copyOfRange(nums,0,mid));
    int[] right = sortArray(Arrays.copyOfRange(nums,mid,n));

    return mergeArray(left,right);
    }

    public int[] mergeArray(int[] left, int[] right){
        int i=0,j=0,k=0;
        int[] arr = new int[left.length + right.length];

        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                arr[k++] = left[i++]; 
            }else {
                arr[k++] = right[j++];
            }
        } 
        while(i<left.length){
            arr[k++] = left[i++];
        }
        while(j<right.length){
            arr[k++]= right[j++];
        }
        return arr;
    }
}