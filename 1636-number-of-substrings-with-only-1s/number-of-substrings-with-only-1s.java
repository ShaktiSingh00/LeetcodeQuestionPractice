class Solution {
    public int numSub(String s) {
        int n = s.length();
       long mod = 1000000007;

        long count1=0;
        long res=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                count1++;
                res=(res+count1)%mod;
            }else{
                count1=0;
            }
        }
        return (int)res;
    }
}