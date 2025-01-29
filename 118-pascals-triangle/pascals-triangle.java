class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> cur,prev=null;
        for(int i=0;i<numRows;i++){
            cur = new ArrayList<>();

            for(int j=0;j<=i;j++){
               // cur = new ArrayList<>();
                if(j==0 || i==j){
                    cur.add(1);
                }else{
                    cur.add(prev.get(j-1)+ prev.get(j));
                }
               // prev=cur;
                      //  list.add(cur);

            }
             prev=cur;
                list.add(cur);

        }
        return list;
    }
}