package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author jessenpan
 * tag:array
 */
public class S57InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> sort = new ArrayList<>();
        int len = intervals.length;

        boolean isInline = false;

        for (int i = 0; i < len; i++) {
            if (newInterval[1] <= intervals[i][1] && newInterval[0] >= intervals[i][0]) {
                isInline = true;
            }
            if (!isInline && intervals[i][0] >= newInterval[0] && intervals[i][1] <= newInterval[1]) {
                continue;
            }

            if (!isInline && newInterval[0] <= intervals[i][1] && newInterval[0] > intervals[i][0]) {
                newInterval[0] = intervals[i][0];
                continue;
            }

            if (!isInline && newInterval[1] >= intervals[i][0] && newInterval[1] < intervals[i][1]) {
                newInterval[1] = intervals[i][1];
                continue;
            }
            sort.add(intervals[i]);
        }
        if (!isInline) {
            sort.add(newInterval);
        }
        sort.sort(Comparator.comparingInt(o -> o[0]));
        return sort.toArray(new int[0][0]);
    }

}
