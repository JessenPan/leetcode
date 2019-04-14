package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S697DegreeOfAnArrayTest {

    private S697DegreeOfAnArray degreeOfAnArray = new S697DegreeOfAnArray();

    @Test
    public void test1() {
        int distance = degreeOfAnArray.findShortestSubArray(new int[] { 1, 2, 2, 3, 1 });
        assertEquals(2, distance);
    }

    @Test
    public void test2() {
        int distance = degreeOfAnArray.findShortestSubArray(new int[] { 1, 2, 2, 3, 1, 4, 2 });
        assertEquals(6, distance);
    }

    @Test
    public void test3() {
        int distance = degreeOfAnArray.findShortestSubArray(new int[] { 2, 1 });
        assertEquals(1, distance);
    }

    @Test
    public void test4() {
        int distance = degreeOfAnArray.findShortestSubArray(new int[] { 2, 1, 1, 2, 1, 3, 3, 3, 1, 3, 1, 3, 2 });
        assertEquals(7, distance);
    }

}
