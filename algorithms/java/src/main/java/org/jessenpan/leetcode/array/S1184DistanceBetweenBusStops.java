package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S1184DistanceBetweenBusStops {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int clockwiseDis = 0, antiClockwiseDis = 0;

        if (start > destination) {
            int tmp = destination;
            destination = start;
            start = tmp;
        }
        for (int i = start; i < destination; i++) {
            clockwiseDis += distance[i];
        }

        for (int i = 0; i < start; i++) {
            antiClockwiseDis += distance[i];
        }
        int n = distance.length;
        for (int i = destination; i < n; i++) {
            antiClockwiseDis += distance[i];
        }

        return Math.min(clockwiseDis, antiClockwiseDis);
    }

}
