package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:array
 */
public class S832FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] A) {

        int[][] flipAndInvertedImages = new int[A.length][A[0].length];

        int lengthOfA = A.length;
        int lengthOfSubA = A[0].length;
        for (int i = 0; i < lengthOfA; i++) {
            int flipIndex = lengthOfSubA - 1;
            for (int j = 0; j < lengthOfSubA; j++) {
                flipAndInvertedImages[i][j] = A[i][flipIndex] == 0 ? 1 : 0;
                flipIndex--;
            }
        }
        return flipAndInvertedImages;
    }
}
