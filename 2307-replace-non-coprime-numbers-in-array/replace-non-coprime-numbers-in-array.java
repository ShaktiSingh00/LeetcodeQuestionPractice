class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for (int num : nums) {
            stack.push(num);

            // Keep merging while top two are non-coprime
            while (stack.size() > 1) {
                int top = stack.pop();
                int prev = stack.pop();

                int g = gcd(top, prev);

                if (g == 1) {
                    // Not non-coprime → restore order correctly
                    stack.push(prev);
                    stack.push(top);
                    break;
                } else {
                    // Merge into LCM and continue checking
                    int lcm = lcmNum(top, prev);
                    stack.push(lcm);
                }
            }
        }

        return new ArrayList<>(stack);
    }

    // Use long to avoid overflow
    public static int lcmNum(int a, int b) {
        return (int) ((long) a * b / gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
