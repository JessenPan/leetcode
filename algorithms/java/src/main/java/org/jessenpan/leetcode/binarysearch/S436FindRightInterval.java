package org.jessenpan.leetcode.binarysearch;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jessenpan
 * tag:binarySearch
 */
public class S436FindRightInterval {

    public int[] findRightInterval(int[][] intervals) {

        int len = intervals.length;
        if (len == 1) {
            return new int[] { -1 };
        }
        Item[] items = new Item[len];
        for (int i = 0; i < len; i++) {
            items[i] = new Item(intervals[i][0], intervals[i][1], i);
        }
        Arrays.sort(items, Comparator.comparingInt(o -> o.left));

        int[] rs = new int[len];
        int mid, left, right;
        boolean found;
        for (int i = 0; i < len; i++) {

            int comparedVal = intervals[i][1];
            left = 0;
            right = len - 1;
            found = false;
            while (left <= right) {
                mid = (left + right) / 2;
                if (items[mid].left >= comparedVal) {
                    if (mid == 0 || items[mid].left == comparedVal || items[mid - 1].left < comparedVal) {
                        rs[i] = items[mid].idx;
                        found = true;
                        break;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    left = mid + 1;
                }
            }
            if (!found) {
                rs[i] = -1;
            }
        }

        return rs;
    }

    static class Item {

        Item(int left, int right, int idx) {
            this.left = left;
            this.right = right;
            this.idx = idx;
        }

        int left, right, idx;
    }

}
