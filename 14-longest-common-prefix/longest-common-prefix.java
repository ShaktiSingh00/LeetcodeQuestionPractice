class Solution {
    public String longestCommonPrefix(String[] strs) {
    //     String str = strs[0];
    //     for(int i=0 ; i<strs.length ; i++){
    //         str = helperFun(str,strs[i]);
    //     }

    //     return str;
    // }

    // public String helperFun(String str1, String str2){
    //     int n=str1.length();
    //     int m=str2.length();
    //     int x = Math.min(n,m);
    //     StringBuilder sb = new StringBuilder();
    //     for(int i=0;i<x;i++){
    //         if(str1.charAt(i) == str2.charAt(i)){
    //             sb.append(str1.charAt(i));
    //         }
    //         else{
    //             break;
    //         }
    //     }
    //     return sb.toString();
       int n = strs.length;
       StringBuilder sb = new StringBuilder();
       Arrays.sort(strs);
       String left = strs[0];
       String right = strs[n-1];
       int len = Math.min(left.length(), right.length());
       for(int i=0;i<len;i++){
           if(left.charAt(i) != right.charAt(i)){
               return sb.toString();
           }
           sb.append(left.charAt(i));
           
       }
       return sb.toString();
    }
}