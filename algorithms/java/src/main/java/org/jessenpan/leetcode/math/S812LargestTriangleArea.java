package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S812LargestTriangleArea {

    /**
     * The formula for finding the area given the coordinates of three points is: <code>1/2[(x1y2-x2y1)+(x2y3-x3y2)+(x3y1-x1y3)]</code>
     */
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0.0;
        int length = points.length;
        for (int i = 0; i < length - 2; i++) {  //x1,y1
            for (int j = i + 1; j < length - 1; j++) {  //x2,y2
                for (int k = j + 1; k < length; k++) { //x3,y3
                    double area = Math.abs((points[i][0] * points[j][1] + points[j][0] * points[k][1] + points[k][0] * points[i][1] - points[j][0] * points[i][1] - points[k][0] * points[j][1] - points[i][0] * points[k][1])) / 2.0;
                    maxArea = Math.max(maxArea, Math.abs(area));
                }
            }
        }
        return maxArea;
    }

}
