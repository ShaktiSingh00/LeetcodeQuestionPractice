class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // int n = arr.length;
        // int count = 0;
        // int[] res = new int[n];
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]==arr[j]){
        //             count++;   
        //         }
        //     }
        //     res[i] = count;       
        // }

        // for(int i= 1;i<res.length;i++){
        //     if(arr[i]==arr[i-1]){
        //         return false;
        //     }
        // }
        // return true;

         HashMap<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Check if the number of occurrences is unique
        HashSet<Integer> uniqueCounts = new HashSet<>();
        for (int count : countMap.values()) {
            if (!uniqueCounts.add(count)) {
                return false; // Duplicate count found
            }
        }

        return true;
    }
    
}