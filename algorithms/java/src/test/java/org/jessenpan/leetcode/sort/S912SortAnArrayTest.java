package org.jessenpan.leetcode.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S912SortAnArrayTest {

    private S912SortAnArray sortAnArray = new S912SortAnArray();

    @Test
    public void test1() {
        List<Integer> sorted = sortAnArray.sortArray(new int[] { 5, 2, 3, 1 });
        Assert.assertEquals(Arrays.asList(1, 2, 3, 5), sorted);
    }

    @Test
    public void test2() {
        List<Integer> sorted = sortAnArray.sortArray(new int[] { 5, 1, 1, 2, 0, 0 });
        Assert.assertEquals(Arrays.asList(0, 0, 1, 1, 2, 5), sorted);
    }

}
