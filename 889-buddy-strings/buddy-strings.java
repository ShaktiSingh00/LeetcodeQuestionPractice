class Solution {
    public boolean buddyStrings(String s, String goal) {
        int m = s.length();
        int n = goal.length();
        if(m!=n){
            return false;
        }
        int count = 0;
        for(int i=0;i<m;i++){
            if(s.charAt(i) != goal.charAt(i)){
                count++;
            }
        }
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        for(char c : s.toCharArray()){
            a1[c-'a']++;
        }
        for(char c : goal.toCharArray()){
            a2[c-'a']++;
        }
        if(count > 2){
            return false;
        }
        for(int i=0;i<26;i++){
            if(a1[i] != a2[i]){
                return false;
            }
        }
        if(count == 2){
            return true;
        }
        for(int i=0;i<26;i++){
            if(a1[i] >= 2){
                return true;
            }
        }

        return false;
    }
}