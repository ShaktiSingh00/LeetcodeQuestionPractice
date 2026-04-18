class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }

    public int reverse(int res){
        int sum = 0;

        while(res>0){
            int rem = res%10;
            sum = sum*10+rem;
            res = res/10;
        }
        return sum;
    }
}