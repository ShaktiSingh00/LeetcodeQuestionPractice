class Solution {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y = 0;
        Set<String> hset = new HashSet<>();
        String key = x + "$" + y;
        hset.add(key);

        for(char c : path.toCharArray()){
            if(c=='N'){
                y++;
            }else if(c == 'S') y--;
            else if(c == 'E') x++;
            else x--;

            key = x + "$" +y;
            if(hset.contains(key)){
                return true;
            }
            hset.add(key);

        }

        return false;

    }
}