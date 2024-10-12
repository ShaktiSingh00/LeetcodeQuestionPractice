class Solution {
    public int minGroups(int[][] intervals) {
            List<int[]> events = new ArrayList<>();

        // Create events for the start and end of intervals
        for (int[] interval : intervals) {
            events.add(new int[]{interval[0], 1});  // Start of interval
            events.add(new int[]{interval[1] + 1, -1});  // End of interval (exclusive)
        }

        // Sort events, first by time, and if equal, by type (end events come first)
        Collections.sort(events, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        int maxGroups = 0;
        int currentGroups = 0;

        // Process all events
        for (int[] event : events) {
            currentGroups += event[1];  // Update active groups
            maxGroups = Math.max(maxGroups, currentGroups);  // Track max concurrent groups
        }

        return maxGroups;
    }
}