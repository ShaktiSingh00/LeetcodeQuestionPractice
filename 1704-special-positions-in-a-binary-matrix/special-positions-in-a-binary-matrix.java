class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0){
                     continue;
                }

                boolean find = true;
                for(int x =0 ; x<n ;x++){
                    if(x != i && mat[x][j]==1){

                        find = false;
                        break;
                    }
                }
                for(int c = 0; c<m ;c++){
                    if(c != j && mat[i][c]==1){

                        find = false;
                        break;
                    }
                }

                if(find){
                    count++;
                }
            }
        }


        return count;
    }
}