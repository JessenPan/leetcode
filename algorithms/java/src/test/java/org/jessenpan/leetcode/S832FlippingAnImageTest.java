package org.jessenpan.leetcode;

import org.junit.Test;

/**
 * @author jessenpan
 */
public class S832FlippingAnImageTest {

    private S832FlippingAnImage flippingAnImage = new S832FlippingAnImage();

    @Test
    public void test1() {
        int[][] result = flippingAnImage.flipAndInvertImage(new int[][] { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } });
    }

    @Test
    public void test2() {
        int[][] result = flippingAnImage.flipAndInvertImage(new int[][] { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } });
    }

}
