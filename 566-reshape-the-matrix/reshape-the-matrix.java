class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int row = mat.length;
        int col = mat[0].length;

        if((row * col) != (r * c)) return mat;

        int[][] arr = new int[r][c];
        int rowNum = 0;
        int colNum = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[rowNum][colNum] = mat[i][j];
                colNum++;
                if(colNum == c){
                    colNum = 0;
                    rowNum++;
                }
            }
        }
        return arr;
    }
}