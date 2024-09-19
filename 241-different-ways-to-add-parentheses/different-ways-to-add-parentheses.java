class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
           List<Integer> results = new ArrayList<>();
        
        // Loop through the expression
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            // Check if the character is an operator
            if (c == '+' || c == '-' || c == '*') {
                // Split the expression into left and right parts
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                
                // Recursively compute results for the left and right parts
                List<Integer> leftResults = diffWaysToCompute(left);
                List<Integer> rightResults = diffWaysToCompute(right);
                
                // Combine results from the left and right parts
                for (int leftValue : leftResults) {
                    for (int rightValue : rightResults) {
                        int result = compute(leftValue, rightValue, c);
                        results.add(result);
                    }
                }
            }
        }
        
        // If no operators were found, parse the expression as an integer
        if (results.isEmpty()) {
            results.add(Integer.parseInt(expression));
        }
        
        return results;
    }
    private int compute(int left, int right, char operator) {
        switch (operator) {
            case '+':
                return left + right;
            case '-':
                return left - right;
            case '*':
                return left * right;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}