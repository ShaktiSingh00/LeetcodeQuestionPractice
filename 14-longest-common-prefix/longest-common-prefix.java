class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for(int i=0 ; i<strs.length ; i++){
            str = helperFun(str,strs[i]);
        }

        return str;
    }

    public String helperFun(String str1, String str2){
        int n=str1.length();
        int m=str2.length();
        int x = Math.min(n,m);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<x;i++){
            if(str1.charAt(i) == str2.charAt(i)){
                sb.append(str1.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}