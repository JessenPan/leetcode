package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S782TransformToChessboardTest {

    private S782TransformToChessboard transformToChessboard = new S782TransformToChessboard();

    @Test
    public void test1() {
        int t = transformToChessboard.movesToChessboard(new int[][] { { 0, 1, 1, 0 }, { 0, 1, 1, 0 }, { 1, 0, 0, 1 }, { 1, 0, 0, 1 } });
        Assert.assertEquals(2, t);
    }

    @Test
    public void test2() {
        int t = transformToChessboard.movesToChessboard(new int[][] { { 0, 1 }, { 1, 0 } });
        Assert.assertEquals(0, t);
    }

    @Test
    public void test3() {
        int t = transformToChessboard.movesToChessboard(new int[][] { { 1, 0 }, { 1, 0 } });
        Assert.assertEquals(-1, t);
    }

}
