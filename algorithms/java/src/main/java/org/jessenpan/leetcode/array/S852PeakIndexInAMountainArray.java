package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S852PeakIndexInAMountainArray {

    public int peakIndexInMountainArray(int[] array) {
        int length = array.length - 1;
        int index = -1;
        boolean isUp = true;
        for (int i = 0; i < length; i++) {

            if (isUp && array[i] > array[i + 1]) {
               index=i;
               isUp=false;
            } else if (!isUp && array[i] < array[i + 1]) {
                break;
            }
        }
        return index;
    }

}
