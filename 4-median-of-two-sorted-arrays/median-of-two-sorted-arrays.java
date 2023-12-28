class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int i=0;
        int j=0;
        int k=0;
        int sum = 0;
        int[] arr = new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k++] = nums1[i++];
            }
              else{
                arr[k++] = nums2[j++];
            }
        }

            while(i<m){
                arr[k++] = nums1[i++];
            }
            while(j<n){
                arr[k++] = nums2[j++];
            }

        
        for(int x : arr){
            sum = sum+x;
        }

       double mid;
        if (arr.length % 2 == 0) {
            mid = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        } else {
            mid = arr[arr.length / 2];
        }

        return mid;
    }
}