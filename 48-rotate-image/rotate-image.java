class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
       // int m = matrix[0].length;
    //    int[][] mat = new int[n][n];
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             mat[j][n-i-1]=matrix[i][j];
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             matrix[i][j]=mat[i][j];
    //         }
    //     }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
    }
}