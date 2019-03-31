package org.jessenpan.leetcode.binarysearch;

import org.jessenpan.leetcode.S704BinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S704BinarySearchTest {

    private S704BinarySearch binarySearch = new S704BinarySearch();

    @Test
    public void test() {
        int position = binarySearch.search(new int[] { -1, 0, 3, 5, 9, 12 }, 9);
        assertEquals(4, position);
    }

    @Test
    public void test1() {
        int position = binarySearch.search(new int[] { -1, 0, 3, 5, 9, 12 }, 2);
        assertEquals(-1, position);
    }

    @Test
    public void test2() {
        int position = binarySearch.search(new int[] { 2, 5 }, 5);
        assertEquals(1, position);
    }

    @Test
    public void test3() {
        int position = binarySearch.search(new int[] { -1, 0, 5 }, -1);
        assertEquals(0, position);
    }

}
