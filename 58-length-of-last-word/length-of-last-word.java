// class Solution {
//     public int lengthOfLastWord(String s) {
//         int count=0;
//          s = s.trim();
//          for(int i=s.length()-1;i>=0;i--)
//         {
//            if(s.charAt(i) !=' ')
//             {
//                 count++;
//             }
//             else
//             {
//                 break;
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int lengthOfLastWord(String s) {
        // int n = s.length();
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break; // Break the loop when encountering a space
            }
        }
        return count;
    }
}
