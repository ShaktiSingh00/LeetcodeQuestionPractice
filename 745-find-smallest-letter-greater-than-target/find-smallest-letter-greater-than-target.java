class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        char res = letters[0];
        int left=0, right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
           if(target >= letters[mid]){
                left = mid+1;
            }else{
                res = letters[mid];
                right=mid-1;
            }
        }
        return res;
    }
}