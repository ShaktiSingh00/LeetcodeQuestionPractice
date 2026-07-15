class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=-1;
        int oddSum=0;
        int evenSum=0;
        int even=0;
        int count=1;
        while(count<=n){
            odd += 2;
            oddSum += odd;
            even += 2;
            evenSum += even;
            count++;
        }

        return gcd(oddSum, evenSum);
    }

    public int gcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}