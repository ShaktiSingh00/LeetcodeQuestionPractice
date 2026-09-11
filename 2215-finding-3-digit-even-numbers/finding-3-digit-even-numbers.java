class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        int[] result = new int[10];
        int y=0;
        for(int i=0;i<n;i++){
            result[digits[i]]++;
        }
        int count=0;

        List<Integer> list = new ArrayList<>();

        for(int i=100;i<1000;i=i+2){
            int d1 = i/100;
            int d2 = (i/10)%10;
            int d3 = i%10;

            int[] res = new int[10];

            res[d1]++;res[d2]++;res[d3]++;
            boolean isFind = true;

            for(int x=0;x<10;x++){
                if(res[x]>result[x]){
                    isFind = false;
                    break;
                }
            }

            if(isFind){
                list.add(i);
            }
        }

        int[] fres = new int[list.size()];

        for(int i=0;i<list.size();i++){
            fres[count++]=list.get(i);
        }
        return fres;
    }
}