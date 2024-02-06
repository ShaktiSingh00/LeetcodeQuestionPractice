class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max=0;
        int i;
        // int sum=0;
        for(i=0;i<candies.length;i++)
        {
            max=Math.max(max,candies[i]);
        }

        for(i=0;i<candies.length;i++)
        {
            if(candies[i] + extraCandies >= max)
            {
                list.add(i,true);
            }
            else{
                list.add(i,false);
            }
        }


        return list;
    }
}
