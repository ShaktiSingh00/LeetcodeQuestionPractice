class Solution {
    public int minSwaps(String s) {
    //     int n = s.length();
    //    // int count = 0;
    //     Stack<Character> st = new Stack<>();
    //     for(int i=0;i<n;i++){
    //         char c = s.charAt(i);
    //         if(c=='['){
    //             st.push(c);
    //             //count++;
    //         }else{
    //             if(st.isEmpty() || st.peek()==']'){
    //                 st.push(c);
    //             }else{
    //                 st.pop();
    //             }
    //         }
    //     }
    //     int totalStack = st.size();
    //     int closeBracket = totalStack/2;
    //     return (closeBracket+1)/2;
           int n = s.length();
           int count=0, close = 0;
           for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='['){
                count++;
            }else{
                if(count <= 0){
                    close++;
                }else{
                    count--;
                }
            }
           }
           return (close+1)/2;
    }
}