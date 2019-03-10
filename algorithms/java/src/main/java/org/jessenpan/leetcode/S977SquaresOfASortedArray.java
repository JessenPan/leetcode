package org.jessenpan.leetcode;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:array
 */
public class S977SquaresOfASortedArray {

    public int[] sortedSquares(int[] a) {
        int[] sortedSquares = new int[a.length];
        int lengthOfA = a.length;
        for (int i = 0; i < lengthOfA; i++) {
            sortedSquares[i] = a[i] * a[i];
        }
        Arrays.sort(sortedSquares);
        return sortedSquares;
    }

}
