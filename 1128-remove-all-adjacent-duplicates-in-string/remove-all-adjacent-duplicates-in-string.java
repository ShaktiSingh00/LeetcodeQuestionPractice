class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> s1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(s.isEmpty()){
                s1.push(c);
            }else {
                if(!s1.isEmpty() && s1.peek() == c){
                    s1.pop();
                }else{
                    s1.push(c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : s1){
            sb.append(c);
        }

        return sb.toString();
    }
}