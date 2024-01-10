class Solution {
    public int subarraySum(int[] nums, int k) {
        // // int n = nums.length;
        // // int max = 0, sum = 0;
        // // for(int i=0;i<n;i++)
        // // {
        // //     for(int j=i;j<n;j++){
        // //         sum += nums[j];

        // //         if(sum==k){
        // //         max = Math.max(max,j-i+1);
        // //     }
        // //     }
        // // }
        // // return max;

        // // int n = nums.length;
        // // int i=0,j=0,sum =nums[0];
        // // int count=0;
        // //int max = Integer.MIN_VALUE;
        // // while(j<n){
        // //     //sum += nums[j];
        // //     while(i<=j && sum>k){
        // //         sum -= nums[i];
        // //         i++;
        // //     }
        // //     if(sum==k){
        // //         count++;
        // //     }
        // //     j++;
        // //     if (j < n) sum += nums[j];

        // // }
        // // return count;
        
        // int n = nums.length;
        // int sum =0;
        // int max = 0;
        // Map<Integer, Integer> hmap = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     sum += nums[i];
        //     if(sum == k){
        //         max = Math.max(max, i+1);
        //     }
        //     int rem = sum-k;
        //     if(hmap.containsKey(rem)){
        //         int len = i-hmap.get(rem);
        //     }else{
        //         hmap.put(sum,i);
        //     }

        // }
        // return max;

    //     int sum = 0;
    // int ans = 0;
    // HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    // map.put(0,1);
    // for(int i = 0; i < nums.length; i++){
    //     sum += nums[i];
    //     if(map.containsKey(sum - k)){
    //         ans += map.get(sum - k);
    //     }
    //     map.put(sum,map.getOrDefault(sum,0) + 1);
    // }
    // return ans;
    int n = nums.length;
     int count =0;
     int sum = 0;
     Map<Integer, Integer> hmap = new HashMap<>();
     for(int i=0;i<n;i++){
         sum += nums[i];
         if(sum ==k){
             count++;
        }
        if(hmap.containsKey(sum-k)){
            count += hmap.get(sum-k);
        }
        hmap.put(sum,hmap.getOrDefault(sum,0)+1);
     }
     return count;
    }
}