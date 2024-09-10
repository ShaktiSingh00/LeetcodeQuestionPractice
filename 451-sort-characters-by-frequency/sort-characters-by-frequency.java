class Solution {
    public String frequencySort(String s) {
       int n = s.length();
       HashMap<Character,Integer> hmap = new HashMap<>();
       for(char c : s.toCharArray()){
        hmap.put(c,hmap.getOrDefault(c,0)+1);
       }
       StringBuilder sb = new StringBuilder();
       while(!hmap.isEmpty()){
         int max = Integer.MIN_VALUE;
         char maxChar = '\0';
         for(Map.Entry<Character,Integer> entry : hmap.entrySet()){
            if(entry.getValue() > max ){
                max = entry.getValue();
                maxChar = entry.getKey();
            }
          }
         for (int i = 0; i < max; i++) {
                sb.append(maxChar);
            }            // Remove the character from the map after processing
            hmap.remove(maxChar);
       }
       return sb.toString();
    }
}