class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        int count =0;
        for(char c : s.toCharArray()){
            hmap.put(c,hmap.getOrDefault(c,0)+1);

            if(hmap.get(c)%2==1){
                count++;
            }else{
                count--;
            }
        }
        if (count > 1){
            return s.length() - count + 1;
        }
        return s.length();
    }
}