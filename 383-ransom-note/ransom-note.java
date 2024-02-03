class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hmap = new HashMap<>();

        for(char ch : magazine.toCharArray()){
            hmap.put(ch, hmap.getOrDefault(ch,0)+1);
        }

        for(char ch : ransomNote.toCharArray()){
            int count = hmap.getOrDefault(ch,0);

            if(count <=0){
                return false;
            }

            hmap.put(ch, count-1);
        }


        return true;
    }
}