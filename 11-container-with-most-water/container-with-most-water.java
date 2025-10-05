class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start=0, end = n-1;
        int sum = 0;
        int min =0;
        int max=0;

        while(start<end){

            int dif = end-start;
            min = Math.min(height[start], height[end]);

            int max1 = dif*min;
            max= Math.max(max,max1);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }

        return max;
    }
}