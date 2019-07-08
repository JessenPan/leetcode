package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S769MaxChunksToMakeSorted {

    public int maxChunksToSorted(int[] arr) {
        int chunks = 0, maxLeft = -1;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            maxLeft = Math.max(arr[i], maxLeft);
            if (maxLeft == i) {
                chunks++;
            }
        }

        return chunks;
    }

}
