class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i+1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            int diff = arr[i+1]-arr[i];

            if(diff==minDiff){
                        List<Integer> ans = new ArrayList<>();

                ans.add(arr[i]);
                ans.add(arr[i+1]);
                list.add(ans);
            }
        }

        return list;


    }
}