package org.jessenpan.leetcode.doublepointer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:doublepointer
 */
public class S986IntervalListIntersections {

    public int[][] intervalIntersection(int[][] a, int[][] b) {
        List<int[]> intervals = new ArrayList<>();

        int lenOfA = a.length, lenOfB = b.length;
        int aIdx = 0, bIdx = 0, left, right;
        while (aIdx < lenOfA && bIdx < lenOfB) {

            if (b[bIdx][0] > a[aIdx][1]) {
                aIdx++;
                continue;
            }

            if (a[aIdx][0] > b[bIdx][1]) {
                bIdx++;
                continue;
            }

            left = Math.max(a[aIdx][0], b[bIdx][0]);
            right = Math.min(a[aIdx][1], b[bIdx][1]);
            intervals.add(new int[] { left, right });
            if (a[aIdx][1] == b[bIdx][1]) {
                aIdx++;
                bIdx++;
            } else if (a[aIdx][1] < b[bIdx][1]) {
                aIdx++;
            } else {
                bIdx++;
            }
        }
        int[][] rs = new int[intervals.size()][2];
        for (int i = 0; i < intervals.size(); i++) {
            rs[i] = intervals.get(i);
        }
        return rs;
    }

}
