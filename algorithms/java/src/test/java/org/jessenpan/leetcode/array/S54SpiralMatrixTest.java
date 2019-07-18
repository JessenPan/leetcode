package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S54SpiralMatrixTest {

    private S54SpiralMatrix spiralMatrix = new S54SpiralMatrix();

    @Test
    public void test1() {
        List<Integer> lists = spiralMatrix.spiralOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
        Assert.assertEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), lists);
    }

    @Test
    public void test2() {
        List<Integer> lists = spiralMatrix.spiralOrder(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } });
        Assert.assertEquals(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), lists);
    }

}
