class Solution {
    public int fib(int n) {
        int a=0,b=1,c=0;
        if(n<=0){
            return 0;
        }
        while(n>1){
            c=a+b;
            a=b;
            b=c;
            n--;
        }

        return b;
    }
}