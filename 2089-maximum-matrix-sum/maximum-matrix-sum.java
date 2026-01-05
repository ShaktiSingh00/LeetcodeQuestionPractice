class Solution {
    public long maxMatrixSum(int[][] matrix) {
         int n=matrix.length;
        // int m = matrix[0].length;

        // long max = 0; long count=0; long sum=0;

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         sum += Math.abs(matrix[i][j]); 
        //         if(matrix[i][j]<0){
        //             count++;
        //         }  
        //     }
        // }

        // long res = count %2;
        // // if(count==1){
        // //     return sum;
        // // }
        // if(res!=0){
        //     sum = sum - 2*res;
        //     return sum;
        // }
        // return sum;int n = matrix.length;
        int m = matrix[0].length;

        long sum = 0;
        int negCount = 0;
        long minAbs = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = matrix[i][j];
                long absVal = Math.abs(val);

                sum += absVal;
                minAbs = Math.min(minAbs, absVal);

                if (val < 0) {
                    negCount++;
                }
            }
        }

        // If odd number of negatives, subtract 2 * smallest absolute value
        if (negCount % 2 != 0) {
            sum -= 2 * minAbs;
        }

        return sum;
    }
}