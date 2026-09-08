class Solution {
    public int countCommas(int n) {
        if(n<1000) return 0;
        int res =1000;

        if(n>=1000){
            res = n-res+1;
        }

        return res;
    }
}