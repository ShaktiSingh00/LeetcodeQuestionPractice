class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {

            // store digits temporarily
            Stack<Integer> stack = new Stack<>();

            while (num > 0) {
                stack.push(num % 10);
                num /= 10;
            }

            // add digits in correct order
            while (!stack.isEmpty()) {
                list.add(stack.pop());
            }
        }

        // convert list to array
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}