class Solution {
    public String makeFancyString(String s) {
        int n = s.length();

        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));
        int count = 0;

        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
               count++;
               if(count > 1){
                continue;
               }else{
                 sb.append(s.charAt(i));
                 
               }
            }else{
                sb.append(s.charAt(i));
                count=0;
            }
        }

        return sb.toString();
    }
}