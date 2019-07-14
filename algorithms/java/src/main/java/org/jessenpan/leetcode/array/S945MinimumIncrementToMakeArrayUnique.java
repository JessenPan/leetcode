package org.jessenpan.leetcode.array;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:array
 */
public class S945MinimumIncrementToMakeArrayUnique {

    //TODO 
    public int minIncrementForUnique(int[] a) {
        Arrays.sort(a);
        int count = 0;
        int len = a.length;
        for (int i = 1; i < len; i++) {
            if (a[i - 1] >= a[i]) {
                count += a[i - 1] - a[i] + 1;
                a[i] = a[i - 1] + 1;
            }
        }
        return count;
    }

}
