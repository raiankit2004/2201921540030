import java.util.*;

class Solution {
    public double largestTriangleArea(int[][] points) {
        double ans = 0.0;
        int m = points.length;

        // check every combination of 3 points
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                for (int k = j + 1; k < m; k++) {
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];
                    int x3 = points[k][0], y3 = points[k][1];

                    // area formula
                    double area = Math.abs(
                        x1 * (y2 - y3) +
                        x2 * (y3 - y1) +
                        x3 * (y1 - y2)
                    ) / 2.0;

                    ans = Math.max(ans, area); // keep largest
                }
            }
        }

        return ans;
    }
}
