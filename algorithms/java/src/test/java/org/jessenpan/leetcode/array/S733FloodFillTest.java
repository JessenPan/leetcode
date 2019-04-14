package org.jessenpan.leetcode.array;

import org.junit.Test;

/**
 * @author jessenpan
 */
public class S733FloodFillTest {

    private S733FloodFill floodFill = new S733FloodFill();

    @Test
    public void test1() {
        int[][] flood = floodFill.floodFill(new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } }, 1, 1, 2);
        
    }

}
