class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;

        int maxSum = arr[0];
        int maxWithDelete = 0;
        int maxNoDelete = arr[0];

        for(int i=1;i<n;i++){
            maxWithDelete = Math.max(maxWithDelete+arr[i], maxNoDelete);
            maxNoDelete = Math.max(maxNoDelete+arr[i], arr[i]);

            maxSum = Math.max(maxSum, Math.max(maxWithDelete, maxNoDelete));

        }

        return maxSum;
        // int n = arr.length;

        // int noDelete = arr[0];       // best sum ending here with no deletion
        // int oneDelete = 0;           // best sum ending here with one deletion
        // int max = arr[0];

        // for (int i = 1; i < n; i++) {
        //     oneDelete = Math.max(oneDelete + arr[i], noDelete);
        //     noDelete = Math.max(noDelete + arr[i], arr[i]);
        //     max = Math.max(max, Math.max(oneDelete, noDelete));
        // }

        // return max;

    }
}