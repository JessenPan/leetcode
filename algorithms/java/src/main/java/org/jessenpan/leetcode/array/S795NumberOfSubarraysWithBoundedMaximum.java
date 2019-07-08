package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S795NumberOfSubarraysWithBoundedMaximum {

    public int numSubarrayBoundedMax(int[] a, int l, int r) {
        int len = a.length;
        int num = 0;
        int max;
        for (int i = 0; i < len; i++) {

            max = a[i];
            if (max >= l && max <= r) {
                num++;
            }
            for (int j = i + 1; j < len; j++) {
                max = Math.max(max, a[j]);
                if (max >= l && max <= r) {
                    num++;
                } else if (max > r) {
                    break;
                }
            }
        }
        return num;
    }

}
