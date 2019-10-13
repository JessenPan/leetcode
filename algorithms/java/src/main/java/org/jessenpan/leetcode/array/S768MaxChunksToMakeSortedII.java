package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S768MaxChunksToMakeSortedII {

    public int maxChunksToSorted(int[] arr) {
        int len = arr.length;
        int[] mins = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            if (i == (len - 1)) {
                mins[i] = arr[i];
                continue;
            }
            mins[i] = Math.min(arr[i], mins[i + 1]);
        }

        int chunks = 0;
        Integer max = null;
        for (int i = 0; i < len; i++) {
            if (max == null) {
                max = arr[i];
            }
            max = Math.max(max, arr[i]);
            if (i + 1 == len) {
                chunks++;
                continue;
            }
            if (max <= mins[i + 1]) {
                chunks++;
                max = null;
            }
        }
        return chunks;
    }

}
