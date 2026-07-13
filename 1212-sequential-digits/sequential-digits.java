class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String result = "123456789";

        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();

        List<Integer> list = new ArrayList<>();

        for(int len=lowLen ; len<= highLen ; len++){
            for(int i=0;i<=9-len;i++){
                String str = result.substring(i, i+len);
                int num = Integer.parseInt(str);

                if(num >= low && num<=high){
                    list.add(num);
                }
            }
        }
        return list;
    }
}