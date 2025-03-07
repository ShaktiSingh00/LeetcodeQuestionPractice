class Solution {
    public int[] closestPrimes(int left, int right) {
    //  //   int[] res = new int[2];
    //     int prime = 0;
    //     ArrayList<Integer> list = new ArrayList<>();
    //     for(int i=left;i<=right;i++){
    //         if(primeNumber(i)){
    //             list.add(i);
    //         }
    //     }
    //     int num1=-1,num2=-1;
    //     for(int j=0;j<list.size()-1;j++){
    //         int k = list.get(j+1)-list.get(j);
    //         int min = Integer.MAX_VALUE;
    //         if(k<min){
    //             k=min;
    //             num1=list.get(j);
    //             num2=list.get(j+1);
    //         }
    //     }

    //     return new int{num1,num2};

    // }
    // public static boolean primeNumber(int num){
    //     if(num<1){
    //         return false;
    //     }
    //     for(int i=2;i<=Math.sqrt(num);i++){
    //         if(num%i==0){
    //             return false;
    //         }
    //     }

    //     return true;
        List<Integer> list = new ArrayList<>();
        
        // Collect prime numbers in the given range
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        
        // If there are fewer than two primes, return [-1, -1]
        if (list.size() < 2) {
            return new int[]{-1, -1};
        }

        int num1 = -1, num2 = -1, min = Integer.MAX_VALUE;
        
        // Find the closest prime pair
        for (int j = 0; j < list.size() - 1; j++) {
            int diff = list.get(j + 1) - list.get(j);
            if (diff < min) {
                min = diff;
                num1 = list.get(j);
                num2 = list.get(j + 1);
            }
        }

        return new int[]{num1, num2};
    }

    // Corrected prime check function
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}