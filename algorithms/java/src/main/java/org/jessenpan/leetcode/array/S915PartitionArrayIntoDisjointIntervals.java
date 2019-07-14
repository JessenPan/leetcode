package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S915PartitionArrayIntoDisjointIntervals {

    public int partitionDisjoint(int[] a) {

        int len = a.length;
        int[] mins = new int[len];
        int min = a[len - 1];
        for (int i = len - 1; i >= 0; i--) {
            mins[i] = Math.min(a[i], min);
            min = mins[i];
        }

        int max = a[0];
        for (int i = 0; i < len; i++) {
            max = Math.max(max, a[i]);
            if (i == (len - 1)) {
                continue;
            }
            if (max <= mins[i + 1]) {
                return i + 1;
            }
        }

        return -1;
    }

}
