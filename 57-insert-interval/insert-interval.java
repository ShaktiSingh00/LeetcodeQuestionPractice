class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;

        List<int[]> listA = new ArrayList<>();

        int i=0;

        while(i<n && intervals[i][1]<newInterval[0]){
            listA.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0]= Math.min(intervals[i][0], newInterval[0]);
            newInterval[1]= Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        listA.add(newInterval);

        while(i<n){
            listA.add(intervals[i]);
            i++;
        }
        return listA.toArray(new int[listA.size()][]);


    }
}