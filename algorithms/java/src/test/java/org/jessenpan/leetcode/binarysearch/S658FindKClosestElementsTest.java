package org.jessenpan.leetcode.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S658FindKClosestElementsTest {

    private S658FindKClosestElements findKClosestElements = new S658FindKClosestElements();

    @Test
    public void test1() {
        List<Integer> list = findKClosestElements.findClosestElements(new int[] { 1, 2, 3, 4, 5 }, 4, 3);
        Assert.assertEquals(Arrays.asList(1, 2, 3, 4), list);
    }


    @Test
    public void test2() {
        List<Integer> list = findKClosestElements.findClosestElements(new int[] { 1, 2, 3, 4, 5 }, 4, -1);
        Assert.assertEquals(Arrays.asList(1, 2, 3, 4), list);
    }

}
