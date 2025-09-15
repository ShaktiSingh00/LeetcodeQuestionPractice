class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");

        int count = 0;

        for(String word : words){
            boolean isTrue = true;

            for(char c : brokenLetters.toCharArray()){
                if(word.indexOf(c)!=-1){
                    isTrue = false;
                }
            }

            if(isTrue == true){
                count++;
            }
        }
        return count;
    }
}