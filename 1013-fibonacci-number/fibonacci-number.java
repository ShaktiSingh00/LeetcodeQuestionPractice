class Solution {
    public int fib(int n) {
        // if(n==0){
        //     return 0;
        // }
        // if(n==1){
        //     return 1;
        // }

        // return fib(n-1)+fib(n-2);

        int a = 0,b=1;
        int c = 0;
        if(n==0){
            return 0;
        }
        while(n>=2){
            c=a+b;
            a=b;
            b=c;
            n--;
        }
        return b;
    }
}