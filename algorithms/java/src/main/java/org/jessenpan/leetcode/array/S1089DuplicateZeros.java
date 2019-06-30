package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S1089DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == 0) {
                if (i != (len - 1)) {

                    moveElement(i + 1, arr);
                    arr[i + 1] = 0;
                    i += 2;
                    continue;
                }
            }
            i++;
        }
    }

    private void moveElement(int i, int[] arr) {
        int len = arr.length;
        for (int j = len - 1; j > i; j--) {
            arr[j] = arr[j - 1];
        }
    }

}
