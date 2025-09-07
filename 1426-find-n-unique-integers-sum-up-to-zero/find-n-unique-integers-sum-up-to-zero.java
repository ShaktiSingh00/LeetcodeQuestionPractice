class Solution {
    public int[] sumZero(int n) {
         int[] arr = new int[n];

        int start=0;
        int end=n-1;
        while(start < end)
        {
            arr[start]=start+1;
            arr[end]=arr[start]*-1;
            start++;
            end--;
        }
        return arr;
    }
}