class Solution {
    public int countBinarySubstrings(String s) {
        int n = s.length();
        int count = 0;
        int prev = 0;
        int res = 1;

        for(int i=1;i<n;i++){
            if(s.charAt(i)== s.charAt(i-1)){
                res++;
            }else{
                count += Math.min(prev,res);
                prev = res;
                res=1;
            }
        }

        count += Math.min(prev, res);
        return count;
    }
}