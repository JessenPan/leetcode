package org.jessenpan.leetcode.heap;

import org.junit.Test;

/**
 * @author jessenpan
 */
public class S973KClosestPointsToOriginTest {

    private S973KClosestPointsToOrigin kClosestPointsToOrigin = new S973KClosestPointsToOrigin();

    @Test
    public void test1() {
        int[][] s = kClosestPointsToOrigin.kClosest(new int[][] { { 3, 3 }, { 5, -1 }, { -2, 4 } }, 2);
    }

}
