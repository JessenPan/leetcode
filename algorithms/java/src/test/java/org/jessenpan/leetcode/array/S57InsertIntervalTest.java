package org.jessenpan.leetcode.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author jessenpan
 */
public class S57InsertIntervalTest {

    private S57InsertInterval insertInterval = new S57InsertInterval();

    @Test
    public void test1() {
        int[][] interval = insertInterval.insert(new int[][] { { 1, 3 }, { 6, 9 } }, new int[] { 2, 5 });
        System.out.println(Arrays.toString(interval));
    }

    @Test
    public void test2() {
        int[][] interval = insertInterval.insert(new int[][] { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } }, new int[] { 4, 8 });
        System.out.println(Arrays.toString(interval));
    }

    @Test
    public void test3() {
        int[][] interval = insertInterval.insert(new int[][] { { 1, 5 } }, new int[] { 2, 3 });
        System.out.println(Arrays.toString(interval));
    }
}
