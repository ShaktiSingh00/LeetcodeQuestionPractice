class Solution {
    public int findLUSlength(String a, String b) {
        // int count =0;
        // int n = Math.max(a.length(),b.length());
        // for(int i=0;i<n;i++){
        //     if(a.charAt(i) != b.charAt(i)){
        //         count++;
        //     }
        // }
        
         if(a.equals(b)) return -1;

        if(a.length() > b.length()){
            return a.length();
        }else{
            return b.length();
        }
    }
}