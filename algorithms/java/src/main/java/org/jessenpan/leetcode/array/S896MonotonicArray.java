package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S896MonotonicArray {

    public boolean isMonotonic(int[] array) {
        boolean isInc = false, isDesc = false;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (i == (length - 1)) {
                break;
            }
            if (array[i] < array[i + 1] && isDesc) {
                return false;
            }

            if (array[i] < array[i + 1]) {
                isInc = true;
            }

            if (array[i] > array[i + 1] && isInc) {
                return false;
            }
            if (array[i] > array[i + 1]) {
                isDesc = true;
            }
        }
        return true;
    }
}
