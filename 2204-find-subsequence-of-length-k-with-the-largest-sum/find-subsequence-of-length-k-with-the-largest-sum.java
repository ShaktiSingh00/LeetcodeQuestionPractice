class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
    //     int[] arr = new int[k];
    //     int n = nums.length;
    //     int l = arr.length;
    //     if(n<=k){
    //         return nums;
    //     }
    //     Arrays.sort(nums);
    //    // int count=0;
    //    // int max = 0;
    //    int index=0;
    //     for(int i=n-1;i>=0;i--){
    //         if(index<k){
    //             arr[l-1]=nums[i];
    //             index++;
    //             l--;
    //         }
            
    //     }
    //     return arr;
      int n = nums.length;

        // Step 1: Store value and index pairs
        int[][] valueIndexPairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            valueIndexPairs[i][0] = nums[i];
            valueIndexPairs[i][1] = i;
        }

        // Step 2: Sort by value descending
        Arrays.sort(valueIndexPairs, (a, b) -> Integer.compare(b[0], a[0]));

        // Step 3: Pick top k and store value frequency using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            int val = valueIndexPairs[i][0];
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        // Step 4: Iterate original array and select values in order using map
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
                if (result.size() == k) break;
            }
        }

        // Convert list to array
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}