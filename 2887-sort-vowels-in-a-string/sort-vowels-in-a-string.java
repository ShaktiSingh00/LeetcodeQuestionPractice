class Solution {
    public String sortVowels(String s) {
    //     String vowels = "aeiouAEIOU";
    //     StringBuilder collected = new StringBuilder();

    //     // Collect vowels
    //     for (char ch : s.toCharArray()) {
    //         if (vowels.indexOf(ch) != -1) {
    //             collected.append(ch);
    //         }
    //     }

    //     // Convert to char array for sorting
    //     char[] vowelArr = collected.toString().toCharArray();
    //     bubbleSort(vowelArr);  // sort ASCII

    //     // Place vowels back in order
    //     StringBuilder result = new StringBuilder();
    //     int idx = 0;
    //     for (char ch : s.toCharArray()) {
    //         if (vowels.indexOf(ch) != -1) {
    //             result.append(vowelArr[idx++]);
    //         } else {
    //             result.append(ch);
    //         }
    //     }

    //     return result.toString();
    // }

    // // Simple bubble sort for ASCII
    // private static void bubbleSort(char[] arr) {
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         for (int j = 0; j < arr.length - i - 1; j++) {
    //             if (arr[j] > arr[j + 1]) {
    //                 char temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }
    //     }
    // }
    if (s == null || s.length() <= 1) return s;

        // ASCII ascending order for vowels:
        char[] vowelOrder = {'A','E','I','O','U','a','e','i','o','u'};
        int[] counts = new int[128]; // ascii counts

        // Count vowels
        for (char c : s.toCharArray()) {
            if (isVowel(c)) counts[c]++;
        }

        // Rebuild string: whenever we hit a vowel, place next vowel from vowelOrder
        StringBuilder sb = new StringBuilder(s.length());
        int vowelIdx = 0;
        for (char c : s.toCharArray()) {
            if (!isVowel(c)) {
                sb.append(c);
            } else {
                // find next available vowel in ASCII order
                while (vowelIdx < vowelOrder.length && counts[vowelOrder[vowelIdx]] == 0) {
                    vowelIdx++;
                }
                sb.append(vowelOrder[vowelIdx]);
                counts[vowelOrder[vowelIdx]]--;
            }
        }
        return sb.toString();
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) >= 0;
    }
}