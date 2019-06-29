package org.jessenpan.leetcode.heap;

import java.util.PriorityQueue;

/**
 * @author jessenpan
 * tag:heap
 */
public class S973KClosestPointsToOrigin {

    static class SortPoint {

        int distance;

        int[] point;

        SortPoint(int distance, int[] point) {
            this.distance = distance;
            this.point = point;
        }
    }

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<SortPoint> pQueue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.distance, o1.distance));

        int len = points.length;
        for (int i = 0; i < len; i++) {
            int[] point = points[i];
            int distance = point[0] * point[0] + point[1] * point[1];
            pQueue.add(new SortPoint(distance, point));
            while (pQueue.size() > k) {
                pQueue.poll();
            }
        }

        int[][] closestPoint = new int[k][2];

        int i = 0;
        while (!pQueue.isEmpty()) {
            closestPoint[i] = pQueue.poll().point;
            i++;
        }

        return closestPoint;
    }

}
