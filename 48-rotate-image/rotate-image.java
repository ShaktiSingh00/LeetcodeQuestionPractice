class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
       // int m = matrix[0].length;
       int[][] mat = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[j][n-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=mat[i][j];
            }
        }
        // re
    }
}