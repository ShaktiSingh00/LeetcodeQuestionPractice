class Solution {
    public long coloredCells(int n) {
        // if(n==1){
        //     return 1;
        // }
        // int res = n*n + (n-1)*(n-1);

        // return res;
        // long[] res = new long[n+1];
        // res[0]=1;
        // res[1]=1;
        // for(int i=2;i<n;i++){
        //     res[i] = i*i + res[i-1];
        // }

        // return res[n];
                return (long) n * n + (long) (n - 1) * (n - 1);

    }
}