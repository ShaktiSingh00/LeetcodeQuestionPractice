class Solution {
    public int[] sortArray(int[] nums) {
       int n = nums.length;
       if (n <= 1) {
            return nums; // Base case: arrays with 0 or 1 element are already sorted
        }
      
        int mid = n/2;
        int[] left = sortArray(Arrays.copyOfRange(nums,0,mid));
        int[] right = sortArray(Arrays.copyOfRange(nums,mid,n));

        return merge(left,right);
    }
    public static int[] merge(int[] first, int[] second){
        int m = first.length;
        int n = second.length;
        int i = 0;
        int j=0,k=0;
        int[] arr = new int[m+n];
        while(i<m && j<n){
            if(first[i]<second[j]){
                arr[k++]=first[i++];
            }else{
                arr[k++] = second[j++];
            }
        }
        while(i<m){
            arr[k++]=first[i++];
        }
        while(j<n){
            arr[k++] = second[j++];
        }
        return arr;
    }
}