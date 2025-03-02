class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n = nums1.length, m = nums2.length;
        List<int[]> result = new ArrayList<>();
        
        int i = 0, j = 0;
        
        // Merge both arrays while maintaining order
        while (i < n && j < m) {
            if (nums1[i][0] == nums2[j][0]) { // Same id, sum values
                result.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) { // Add smaller id
                result.add(new int[]{nums1[i][0], nums1[i][1]});
                i++;
            } else { // nums2[j][0] < nums1[i][0]
                result.add(new int[]{nums2[j][0], nums2[j][1]});
                j++;
            }
        }
        
        // Add remaining elements from nums1
        while (i < n) {
            result.add(new int[]{nums1[i][0], nums1[i][1]});
            i++;
        }

        // Add remaining elements from nums2
        while (j < m) {
            result.add(new int[]{nums2[j][0], nums2[j][1]});
            j++;
        }
        
        return result.toArray(new int[result.size()][]);
    



    }
}