package org.jessenpan.leetcode.greedy;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S944DeleteColumnsToMakeSorted {

    public int minDeletionSize(String[] arr) {

        int min = 0;
        int col = arr[0].length();
        int row = arr.length;
        for (int i = 0; i < col; i++) {
            char lastChar = 'a';
            boolean isNeedDeleted = false;
            for (int j = 0; j < row; j++) {
                if (lastChar > arr[j].charAt(i)) {
                    isNeedDeleted = true;
                    break;
                } else {
                    lastChar = arr[j].charAt(i);
                }
            }
            if (isNeedDeleted) {
                min++;
            }
        }
        return min;
    }

}
