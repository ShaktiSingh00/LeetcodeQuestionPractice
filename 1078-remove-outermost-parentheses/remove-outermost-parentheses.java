class Solution {
    public String removeOuterParentheses(String s) {
        // StringBuilder result = new StringBuilder();
        // int count =0;
        // for(char c : s.toCharArray()){
        //     if(c=='('){
        //         if(count != 0){
        //             result.append(c);
        //         }
        //         count++;
        //     }else {
        //         if(count != 1){
        //             result.append(')');
        //         }
        //         count--;
        //     }
        // }
        // return result.toString();

        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('){
                if(st.size()>0){
                    result.append(c);
                }
                st.push(c);
            }else{
                st.pop();
                 if(st.size()>0){
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}