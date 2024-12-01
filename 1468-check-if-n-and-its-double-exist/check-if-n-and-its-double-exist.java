class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++){
            hmap.put(arr[i],i);
        }
        for(int i=0;i<n;i++){
            if(hmap.containsKey(2*arr[i]) && hmap.get(2*arr[i]) != i){
                return true;
            }
        }
        return false;
    }
}