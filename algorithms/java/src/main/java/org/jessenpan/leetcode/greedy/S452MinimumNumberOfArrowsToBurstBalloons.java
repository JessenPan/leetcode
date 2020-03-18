package org.jessenpan.leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S452MinimumNumberOfArrowsToBurstBalloons {

    public int findMinArrowShots(int[][] points) {

        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));

        int start, end, lastEnd = points[0][1];
        int arrow = 0;
        for (int[] point : points) {

            start = point[0];
            end = point[1];

            if (lastEnd < start) {
                arrow++;
                lastEnd = end;
            }
        }
        return arrow + 1;
    }

}
