class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
       int[] res = new int[n];
       int rank =1;
       int[] arr1 = Arrays.copyOf(arr,n);
       Arrays.sort(arr1);
       HashMap<Integer, Integer> hmap = new HashMap<>();

       for(int i=0;i<n;i++){
        if(!hmap.containsKey(arr1[i])){
        hmap.put(arr1[i],rank++);
        }
       }
     //  int in=0;

       for(int i=0;i<n;i++){
        res[i] = hmap.get(arr[i]);
       }

       return res;
    }
}