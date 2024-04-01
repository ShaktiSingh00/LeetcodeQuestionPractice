class Solution {
    public boolean isPalindrome(int x) {
      //  int num =x;
        if(x==reverse(x)){
            return true;
        }else{
            return false;
        }
    }
    public static int reverse(int x){
        int rev = 0;
        while(x>0){
            int rem = x%10;
            rev = rem + rev*10;
            x = x/10;
        }

        return rev;
    }
}