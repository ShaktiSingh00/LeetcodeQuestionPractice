class Solution {
    public int maxPower(String s) {
        int n=s.length();
     //   int i=0;
        int count =1;
        int max = 1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                max=Math.max(max,count);

            }else{
                count=1;
            }
        }
        return max;
    }
}