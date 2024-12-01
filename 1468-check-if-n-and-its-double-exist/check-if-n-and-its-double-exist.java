class Solution {
    public boolean checkIfExist(int[] arr) {
        // Arrays.sort(arr);
        // int i=0,j=arr.length-1;
        // while(i<j){
        //     if(arr[i]*2==arr[j]){
        //         return true;
        //     }else if(arr[i]*2<arr[j]){
        //         i++;
        //     }else{
        //         j--;
        //     }
        // }
        // return false;
        HashSet<Integer> hset = new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            if(hset.contains(arr[i]*2) || (arr[i]%2== 0 && hset.contains(arr[i]/2))){
                return true;
            }
                        hset.add(arr[i]);

        }
        return false;

    }
}