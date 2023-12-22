class Solution {
    public int maxScore(String s) {
          int maxScore = 0;
        int zerosLeft = 0;
        int onesRight = countOnes(s);

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zerosLeft++;
            } else {
                onesRight--;
            }

            int currentScore = zerosLeft + onesRight;
            maxScore = Math.max(maxScore, currentScore);
        }

        return maxScore;
    }

    private static int countOnes(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                count++;
            }
        }
        return count;
    
    }
}