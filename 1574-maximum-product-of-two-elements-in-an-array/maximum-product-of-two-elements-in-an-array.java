class Solution {
     public int maxProduct(int[] nums) {
//       //  int n= nums.length;
//     //   //   int max=0;
//     //   //  int result = 0;
//     //     Arrays.sort(nums);
//     //     int max = (nums[0] - 1) * (nums[1] - 1);

//     //     for(int i=2;i<n;i++){
//     //         int result= (nums[i]-1) * (nums[i-1]-1);
//     //         max=Math.max(result,max);

//     //     }
//     //     return max;

        // implementing a max heap
       

//     int n=nums.length;
//     int max1 = Integer.MIN_VALUE;
//     int max2 = Integer.MAX_VALUE;
//     for(int i=0;i<n;i++){
//       if(nums[i]>= max1){
//           max2=max1;
//           max1= nums[i];
//       } else if(nums[i]>max2){
//           max2=nums[i];
//       }
//     }
//     return (max1-1) * (max2-1);
     int n = nums.length;
     Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      for(int i = 0; i < nums.length; i++)
        {
            pq.add(nums[i]);
        }

        // fetching the top 2 elements as they will be the maximum from the array
        int first = pq.poll();
        int second = pq.poll();

        return (first - 1) * (second - 1);

 
 }
 }