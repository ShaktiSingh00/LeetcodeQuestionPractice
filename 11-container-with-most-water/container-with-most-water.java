    class Solution{
        public int maxArea(int[] height){
              int start=0, end = height.length-1;
              int width=0;
              int n = height.length;
              int max = 0;
              while(start < end){
                width = end-start;
                int min = Math.min(height[start], height[end]);
                int result = width*min;
                 max = Math.max(max,result);
                if(height[start]<height[end]){
                  start++;
                }
                else{
                   end--;
                 }
              }
              return max;
    }}
