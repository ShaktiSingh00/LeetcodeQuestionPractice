class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        if(numRows==1 || n <=numRows ){
            return s;
        }

        StringBuilder[] sb = new StringBuilder[numRows];

        for(int i=0;i<numRows;i++){
            sb[i]=new StringBuilder();
        }

        int index=0;
        boolean flag = false;

        for(char c : s.toCharArray()){
            sb[index].append(c);

            if(index==0 || index == numRows-1){
                flag = !flag;
            }

            index += flag ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();
        for(StringBuilder sa : sb){
            res.append(sa);
        }

        return res.toString();
    }
}