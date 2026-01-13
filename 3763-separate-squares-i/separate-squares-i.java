class Solution {
    public double separateSquares(int[][] squares) {
        double totalArea = 0;
        double low = Double.MAX_VALUE;
        double high = Double.MIN_VALUE;

        // Calculate total area and bounds
        for (int[] s : squares) {
            double y = s[1];
            double l = s[2];
            totalArea += l * l;
            low = Math.min(low, y);
            high = Math.max(high, y + l);
        }

        double target = totalArea / 2.0;

        // Binary search
        for (int iter = 0; iter < 100; iter++) {
            double mid = (low + high) / 2;
            double areaBelow = computeAreaBelow(squares, mid);

            if (areaBelow < target) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private double computeAreaBelow(int[][] squares, double H) {
        double area = 0;

        for (int[] s : squares) {
            double y = s[1];
            double l = s[2];

            if (H <= y) {
                // fully above
                continue;
            } else if (H >= y + l) {
                // fully below
                area += l * l;
            } else {
                // partially cut
                area += (H - y) * l;
            }
        }

        return area;
    }
}
