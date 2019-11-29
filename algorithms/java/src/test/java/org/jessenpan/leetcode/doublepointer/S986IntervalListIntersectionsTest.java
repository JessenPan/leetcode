package org.jessenpan.leetcode.doublepointer;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author jessenpan
 */
public class S986IntervalListIntersectionsTest {

    private S986IntervalListIntersections intervalListIntersections = new S986IntervalListIntersections();

    @Test
    public void test1() {
        int[][] ints = intervalListIntersections.intervalIntersection(new int[][] { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } }, new int[][] { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } });
        System.out.println(Arrays.deepToString(ints));
    }

}
