class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();

        int i=0,j=0;
        int min = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        String ans = "";
        int count=0;

        while(j<n){
            char c = s.charAt(j);
            sb.append(c);

            if(s.charAt(j)=='1'){
                count++;
            }

            while(count == k){
                while (sb.length() > 0 && sb.charAt(0) == '0') {
                    sb.deleteCharAt(0);
                    i++;
                }

                String current = sb.toString();

                if (ans.isEmpty() || current.length() < ans.length() || 
                   (current.length() == ans.length() && current.compareTo(ans) < 0)) {
                    ans = current;
                }

                // Advance left boundary past the first '1'
                if (sb.charAt(0) == '1') {
                    count--;
                }
                sb.deleteCharAt(0);
                i++;
            }
            j++;
            }
               
               return ans;
    }
}