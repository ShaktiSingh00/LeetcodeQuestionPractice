class Solution {
    public List<String> stringMatching(String[] words) {
         List<String> result = new ArrayList<>();

        // Sort words by length in ascending order
        Arrays.sort(words, (a, b) -> a.length() - b.length());

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                // Check if words[i] is a substring of words[j]
                if (words[j].contains(words[i])) {
                    result.add(words[i]);
                    break; // No need to check further for this word
                }
            }
        }

        return result;
    }
    //     List<String> list = new ArrayList<>();
    //     String s = words[0];
    //     for(int i=1;i<words.length;i++){
    //         if(patMat(s,words[i])){
    //             list.add(s);
    //         }
    //     }

    //     return list;

    // }

    // public static String patMat(String str1, String str2){
    //     StringBuilder sb = new StringBuilder();

    //     int min = Math.min(str1.length(), str2.length());
    //     for(int i=0;i<min;i++){
    //         if(str1.charAt(i)==str2.charAt(i)){
    //             sb.append(str1.charAt(i));
    //         }
    //     }

    //     return sb.toString();
    // }
}