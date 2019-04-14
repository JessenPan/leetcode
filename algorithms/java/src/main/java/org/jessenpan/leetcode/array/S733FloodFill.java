package org.jessenpan.leetcode.array;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jessenpan
 * tag:array
 */
public class S733FloodFill {

    private static class Point {

        int sr;
        int sc;

        Point(int sr, int sc) {
            this.sr = sr;
            this.sc = sc;
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int row = image.length, col = image[0].length;
        Queue<Point> points = new LinkedList<>();
        points.add(new Point(sr, sc));
        int initColor = image[sr][sc];
        if(initColor==newColor){
            return image;
        }
        image[sr][sc] = newColor;
        while (!points.isEmpty()) {
            Point point = points.poll();
            if (point.sr - 1 >= 0 && image[point.sr - 1][point.sc] == initColor) {
                image[point.sr - 1][point.sc] = newColor;
                points.offer(new Point(point.sr - 1, point.sc));
            }
            if (point.sr + 1 < row && image[point.sr + 1][point.sc] == initColor) {
                image[point.sr + 1][point.sc] = newColor;
                points.offer(new Point(point.sr + 1, point.sc));
            }
            if (point.sc - 1 >= 0 && image[point.sr][point.sc - 1] == initColor) {
                image[point.sr][point.sc - 1] = newColor;
                points.offer(new Point(point.sr, point.sc - 1));
            }
            if (point.sc + 1 < col && image[point.sr][point.sc + 1] == initColor) {
                image[point.sr][point.sc + 1] = newColor;
                points.offer(new Point(point.sr, point.sc + 1));
            }
        }
        return image;
    }
}
