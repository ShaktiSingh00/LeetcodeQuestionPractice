class Solution {
    public boolean wordPattern(String pattern, String s) {
        // String[] str=s.split("");
        // if(pattern.length() != str.length) return false;
        

        // HashMap<Character, String> hmap = new HashMap<>();
        // for(int i=0;i<pattern.length();i++){
        //     char c = pattern.charAt(i);

        //     if(hmap.containsKey(c)){
        //         if(!hmap.get(c).equals(str[i])){
        //             return false;
        //         }
        //     }else {
        //         if(hmap.containsValue(str[i])){
        //             return false;
        //         }
        //         hmap.put(c,str[i]);
        //     }
        // }
        // return true;
        String[] word = s.split(" ");
        if(word.length != pattern.length()) return false;

        HashMap<Character, String> map = new HashMap();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);

            if(map.containsKey(c)){
                if(!map.get(c).equals(word[i])){
                    return false;
                }
            }else {
                if(map.containsValue(word[i])){
                    return false;
                }
                map.put(c, word[i]);
            }
        }

        return true;
    }
}