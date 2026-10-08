class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        String res = "";
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<n;i++){
            char c = s.charAt(i);

            if(c=='('){
                if (!stack.isEmpty()) {
                    res = res+c;
                }
                stack.push(c);
            }else{
                
                    stack.pop();
               if (!stack.isEmpty()) {
                    res = res+c;
                }
            }
        }
        return res;
    }
}