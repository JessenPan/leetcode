package org.jessenpan.leetcode.math;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:math
 */
public class S963MinimumAreaRectangleII {

    static class Point {

        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double distance(double px, double py) {
            px -= x;
            py -= y;
            return Math.sqrt(px * px + py * py);
        }

        public double distance(Point pt) {
            double px = pt.x - x;
            double py = pt.y - y;
            return Math.sqrt(px * px + py * py);
        }

        public int hashCode() {
            long bits = java.lang.Double.doubleToLongBits(x);
            bits ^= java.lang.Double.doubleToLongBits(y) * 31;
            return (((int) bits) ^ ((int) (bits >> 32)));
        }

        public boolean equals(Object obj) {
            if (obj instanceof Point) {
                Point p2d = (Point) obj;
                return (x == p2d.x) && (y == p2d.y);
            }
            return super.equals(obj);
        }
    }

    //TODO study
    public double minAreaFreeRect(int[][] points) {
        int N = points.length;

        Point[] A = new Point[N];
        Set<Point> pointSet = new HashSet<>();
        for (int i = 0; i < N; ++i) {
            A[i] = new Point(points[i][0], points[i][1]);
            pointSet.add(A[i]);
        }

        double ans = Double.MAX_VALUE;
        for (int i = 0; i < N; ++i) {
            Point p1 = A[i];
            for (int j = 0; j < N; ++j) {
                if (i == j) {
                    continue;
                }
                Point p2 = A[j];
                for (int k = j + 1; k < N; ++k) {
                    if (k == i) {
                        continue;
                    }
                    Point p3 = A[k];
                    Point p4 = new Point(p2.x + p3.x - p1.x, p2.y + p3.y - p1.y);

                    if (pointSet.contains(p4)) {
                        int dot = ((p2.x - p1.x) * (p3.x - p1.x) + (p2.y - p1.y) * (p3.y - p1.y));
                        if (dot == 0) {
                            double area = p1.distance(p2) * p1.distance(p3);
                            if (area < ans) {
                                ans = area;
                            }
                        }
                    }
                }
            }
        }

        return ans < Double.MAX_VALUE ? ans : 0;
    }

}
