package org.jessenpan.leetcode.greedy;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S435NonOverlappingIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (o1, o2) -> o1[0] == o2[0] ? Integer.compare(o1[1], o2[1]) : Integer.compare(o1[0], o2[0]));

        int len = intervals.length;

        int n = 0;
        int[] lastInterval = null;
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                lastInterval = intervals[i];
                continue;
            }
            if (intervals[i][0] >= lastInterval[1]) {
                lastInterval = intervals[i];
                continue;
            }
            if(lastInterval[1]>intervals[i][1]){
                lastInterval=intervals[i];
            }
            n++;
        }

        return n;

    }
}
