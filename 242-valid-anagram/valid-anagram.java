class Solution {
    public boolean isAnagram(String s, String t) {
    //    HashMap<Character,Integer> hmap=new HashMap<>();
    //    if(s.length() != t.length())  return false;
    //    for(char c : s.toCharArray()){
    //       hmap.put(c, hmap.getOrDefault(c,0)+1);
    //    }

    //    for(char c : t.toCharArray()){
    //       if(hmap.containsKey(c)){
    //         if(hmap.get(c)==1){
    //             hmap.remove(c);
    //         }else{
    //             hmap.put(c,hmap.get(c)-1);
    //         }
    //       }else{
    //         return false;
    //       }
    //    }
    //     return hmap.isEmpty();
        int[] f1 = new int[26];
        for(int i=0;i<s.length();i++){
            f1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            f1[t.charAt(i)-'a']--;
        }
        for(int val : f1){
            if(val != 0){
                return false;
            }
        }
        return true;
        
    }
}