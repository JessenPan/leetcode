package org.jessenpan.leetcode.hashmap;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S349IntersectionOfTwoArraysTest {

    private S349IntersectionOfTwoArrays intersectionOfTwoArrays = new S349IntersectionOfTwoArrays();

    @Test
    public void test1() {
        int[] intersection = intersectionOfTwoArrays.intersection(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 });
        assertArrayEquals(intersection, new int[] { 2 });
    }

    @Test
    public void test2() {
        int[] intersection = intersectionOfTwoArrays.intersection(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 });
        assertArrayEquals(intersection, new int[] { 9, 4 });
    }

}
