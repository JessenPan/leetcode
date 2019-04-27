package org.jessenpan.leetcode.breadthfirstsearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S994RottingOrangesTest {

    private S994RottingOranges rottingOranges = new S994RottingOranges();

    @Test
    public void test1() {
        int time = rottingOranges.orangesRotting(new int[][] { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } });
        assertEquals(4, time);
    }

    @Test
    public void test2() {
        int time = rottingOranges.orangesRotting(new int[][] { { 2, 1, 1 }, { 0, 1, 1 }, { 1, 0, 1 } });
        assertEquals(-1, time);
    }

    @Test
    public void test3() {
        int time = rottingOranges.orangesRotting(new int[][] { { 0, 2 } });
        assertEquals(0, time);
    }

}
