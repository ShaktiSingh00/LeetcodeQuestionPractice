class Solution{
    public int maxArea(int[] height){
        int n = height.length;
        int right= n-1, left = 0;
        int width =0;
       
        int max = Integer.MIN_VALUE;
        while(left<right){
            int min = Math.min(height[left], height[right]);
            width = right-left;
            int res = width*min;
            max = Math.max(max,res);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }

        return max;
    }
}
