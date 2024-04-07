class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> hmap=new HashMap<>();
       if(s.length() != t.length())  return false;
       for(char c : s.toCharArray()){
          hmap.put(c, hmap.getOrDefault(c,0)+1);
       }

       for(char c : t.toCharArray()){
          if(hmap.containsKey(c)){
            if(hmap.get(c)==1){
                hmap.remove(c);
            }else{
                hmap.put(c,hmap.get(c)-1);
            }
          }else{
            return false;
          }
       }
        return hmap.isEmpty();
    }
}