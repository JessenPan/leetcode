package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S941ValidMountainArray {

    public boolean validMountainArray(int[] array) {
        if (array.length < 3) {
            return false;
        }
        int length = array.length - 1;
        boolean isUp = true;
        for (int i = 0; i < length; i++) {
            if (array[i] == array[i + 1]) {
                return false;
            }
            if (i == 0) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            } else {
                if (isUp && array[i] > array[i + 1]) {
                    isUp = false;
                } else if (!isUp && array[i] < array[i + 1]) {
                    return false;
                }
            }
        }
        return !isUp;
    }
}
