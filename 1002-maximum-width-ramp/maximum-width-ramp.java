class Solution {
    public int maxWidthRamp(int[] nums) {
        // int maxWidth = 0;
        
        // // Naive approach: using two loops to check all pairs (i, j)
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] <= nums[j]) {
        //             maxWidth = Math.max(maxWidth, j - i);  // Update maximum width
        //         }
        //     }
        // }
        
        // return maxWidth;

         Stack<Integer> stack = new Stack<>();
        int maxWidth = 0;

        // Step 1: Build a stack of decreasing indices
        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }

        // Step 2: Iterate from the end and find the maximum width ramp
        for (int j = nums.length - 1; j >= 0; j--) {
            // Try to pop from the stack as long as we find nums[j] >= nums[stack.peek()]
            while (!stack.isEmpty() && nums[j] >= nums[stack.peek()]) {
                int i = stack.pop();
                maxWidth = Math.max(maxWidth, j - i);
            }
        }

        return maxWidth;
    }
}