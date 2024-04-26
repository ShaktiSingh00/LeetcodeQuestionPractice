class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums){
            hmap.put(num, hmap.getOrDefault(num,0)+1);
        }

        for(HashMap.Entry<Integer, Integer> entry : hmap.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        int[] num = new int[list.size()];
        for(int i=0;i<list.size();i++){
            num[i] = list.get(i);
        }
        return num;
    }
}