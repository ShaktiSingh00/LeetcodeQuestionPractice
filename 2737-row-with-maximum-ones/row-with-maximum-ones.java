class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res = new int[2];
        int pos=0;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                pos = i;
                
            }
        }
        res[0]=pos;
        res[1]=max;

        return res;
    }
}