package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author jessenpan
 * tag:array
 */
public class S56MergeIntervals {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        List<int[]> list = new ArrayList<>();

        int len = intervals.length;
        int[] compared = null;
        for (int i = 0; i < len; i++) {

            if (compared == null) {
                compared = intervals[i];
                continue;
            }

            if (compared[0] <= intervals[i][0] && intervals[i][0] <= compared[1]) {
                if (intervals[i][1] > compared[1]) {
                    compared[1] = intervals[i][1];
                }
            } else {
                list.add(compared);
                compared = intervals[i];
            }
        }
        if (compared != null) {
            list.add(compared);
        }

        return list.toArray(new int[0][0]);
    }
}
