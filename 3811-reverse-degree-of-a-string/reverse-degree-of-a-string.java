class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum=0,mul=1;

        for(int i=0;i<n;i++){
            int c = (123 - (int)(s.charAt(i)));
            sum += c*(i+1);
        }
        return sum;
    }
}