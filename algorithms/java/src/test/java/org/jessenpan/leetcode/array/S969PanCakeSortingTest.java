package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author jessenpan
 */
public class S969PanCakeSortingTest {

    private S969PanCakeSorting panCakeSorting = new S969PanCakeSorting();

    @Test
    public void test1() {
        List<Integer> list = panCakeSorting.pancakeSort(new int[] { 3, 2, 4, 1 });
        Assert.assertEquals(Arrays.asList(4, 2, 4, 3), list);
    }

    @Test
    public void test2() {
        List<Integer> list = panCakeSorting.pancakeSort(new int[] { 1, 2, 3 });
        Assert.assertEquals(Collections.emptyList(), list);
    }

}
