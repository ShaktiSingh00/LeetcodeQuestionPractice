// class Solution {
//     public String gcdOfStrings(String str1, String str2) {
//         int len1 = str1.length();
//         int len2 = str2.length();
        
//         // Swap str1 and str2 if str1 is shorter
//         if (len1 < len2) {
//             return gcdOfStrings(str2, str1);
//         }

//         // Check if str2 is a prefix of str1
//         if (!str1.startsWith(str2)) {
//             return "";
//         }

//         // Find the greatest common divisor
//         for (int i = len2; i >= 1; i--) {
//             if (len2 % i == 0) {
//                 String candidate = str2.substring(0, i);
//                 if (checkDivisor(str1, candidate) && checkDivisor(str2, candidate)) {
//                     return candidate;
//                 }
//             }
//         }

//         return "";
//     }

//     private boolean checkDivisor(String str, String divisor) {
//         int len = str.length();
//         int divisorLen = divisor.length();

//         for (int i = 0; i < len; i += divisorLen) {
//             if (!str.startsWith(divisor, i)) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }


class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcd = gcd(str1.length(), str2.length());
        return str2.substring(0, gcd);
    }

    public int gcd(int a, int b) {
        return (b == 0)? a : gcd(b, a % b);
    }
}

// TC: O(n), SC: O(1)