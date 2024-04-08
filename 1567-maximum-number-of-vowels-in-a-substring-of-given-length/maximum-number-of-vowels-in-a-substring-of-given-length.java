class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
       
        int ans = Integer.MIN_VALUE;
        int count = 0;

        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        ans = Math.max(ans, count);
        for(int i=k;i<n;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            ans = Math.max(ans,count);
        }
           return ans;

    }

    public boolean isVowel(char str){
        
      if(str =='a' || str =='e' || str =='i'|| str =='o'|| str == 'u' ||
             str=='A'|| str =='E'|| str =='I'|| str =='O'|| str =='U'){
                return true;
        }
       
        return false;
    }
}