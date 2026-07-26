class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int i=0,j=0,max=-1;
        

        HashMap<Integer, Integer> hmap = new HashMap<>();

        while(j<n){
            hmap.put(fruits[j], hmap.getOrDefault(fruits[j],0)+1);

            if(hmap.size()>2){
                int first = fruits[i];
                hmap.put(first,hmap.get(first)-1);
                if(hmap.get(first)==0){
                    hmap.remove(first);
                }
                i++;
            }

                max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}