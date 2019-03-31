package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S908SmallestRangeI {

    public int smallestRangeI(int[] array, int range) {
        if (array.length == 1) {
            return 0;
        }
        int min, max;
        min = max = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        int distance = max - min - 2 * range;
        return distance <= 0 ? 0 : distance;
    }
}
