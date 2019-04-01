package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:math
 */
public class S812LargestTriangleArea {

    public double largestTriangleArea(int[][] points) {
        int maxY = 0, minY = 0, minX = 0, maxX = 0;
        int length = points.length;
        for (int i = 0; i < length; i++) {
            int[] point = points[i];
            if (point[0] == 0 && point[1] == 0) {
                minX = minY = 0;
                continue;
            }
            if (point[0] == 0) {
                if (point[1] > maxY) {
                    maxY = point[1];
                }

                if (i == 0) {
                    minY = point[1];
                } else if (point[1] < minY) {
                    minY = point[1];
                }
            }

            if (point[1] == 0) {
                if (point[0] > maxX) {
                    maxX = point[0];
                }

                if (i == 0) {
                    minX = point[0];
                } else if (point[0] < minX) {
                    minX = point[0];
                }
            }
        }

        if (minX == minY) {
            return (maxY * maxX) / 2.0;
        } else {
            double max = Math.sqrt(maxX * maxX + maxY + maxY);
            int xLength = maxX - minX, yLength = maxY - minY;
            double theSecondLength;
            if (xLength > yLength) {
                theSecondLength = Math.sqrt(minY * minY + maxX * maxX);
                return 0.25 * Math.sqrt((max + theSecondLength + xLength) * (max + theSecondLength - xLength) * (max + xLength - theSecondLength) * (theSecondLength + xLength - max));
            } else {
                theSecondLength = Math.sqrt(maxX * maxX + minY * minY);
                return 0.25 * Math.sqrt((max + theSecondLength + yLength) * (max + theSecondLength - yLength) * (max + yLength - theSecondLength) * (theSecondLength + yLength - max));
            }
        }
    }

}
