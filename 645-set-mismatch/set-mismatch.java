class Solution {
    public int[] findErrorNums(int[] nums) {
        // int[] arr = new int[2];
        // int n = nums.length;
        // //int count = 0;
        // for(int i = 1;i<=n;i++){
        //      int count = 0;
        //     for(int j=0;j<n;j++){
        //         if(nums[j]==i){
        //             count++;
        //         }
        //     }
        //     if(count==2){
        //         arr[0]=i;
        //     }
        //     if(count==0){
        //         arr[1] = i;
        //     }
        // }

        // return arr;
        int n = nums.length;
        int actual_sum = n*(n+1)/2;
        int unique_sum = 0, array_sum=0;
        int[] arr = new int[2];
        Set<Integer> hset = new HashSet();
        
        for(int num : nums){
            hset.add(num);
        }
        for(int num:nums){
            array_sum += num;
        }
        for(int num : hset){
            unique_sum += num;
        }

        arr[1]=actual_sum - unique_sum;
        arr[0] = array_sum - unique_sum;

        return arr;
    }
}