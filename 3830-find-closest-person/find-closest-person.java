class Solution {
    public int findClosest(int x, int y, int z) {
      //  int diff = 0;

        int x1 = Math.abs(z-x);
        int x2 = Math.abs(z-y);

        if(x1==x2){
            return 0;
        }

        int diff = x1<x2 ? 1 : 2;
        return diff;

    }
}