class Solution {
    public int maximumSwap(int num) {
        char[] numArr = Integer.toString(num).toCharArray();
        int n = numArr.length;
        char maxNum = numArr[n-1];
        int maxIn = n-1;
        int index1 = -1;
        int index2 = -1;

        for(int i=n-2;i>=0;i--){
            if(numArr[i]>maxNum){
                maxNum= numArr[i];
                maxIn=i;
            }else if(numArr[i]<maxNum){
                index1=i;
                index2 = maxIn;
            }
        }
        if(index1 != -1){
            char temp = numArr[index1];
            numArr[index1]=numArr[index2];
            numArr[index2]=temp;
        }
        return Integer.parseInt(new String(numArr));
    }
}