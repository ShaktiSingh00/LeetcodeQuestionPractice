class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
        long res =0;

        for(long i=1000;i<=n;i = i*1000){
            res += n-i+1;
        }

        return res;
    }
}