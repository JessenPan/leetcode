package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S442FindAllDuplicatesInAnArrayTest {

    private S442FindAllDuplicatesInAnArray findAllDuplicatesInAnArray = new S442FindAllDuplicatesInAnArray();

    @Test
    public void test1() {
        List<Integer> list = findAllDuplicatesInAnArray.findDuplicates(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 });
        Assert.assertEquals(Arrays.asList(2,3), list);
    }

    @Test
    public void test2() {
        List<Integer> list = findAllDuplicatesInAnArray.findDuplicates(new int[] { 10, 2, 5, 10, 9, 1, 1, 4, 3, 7 });
        Assert.assertEquals(Arrays.asList(10, 1), list);
    }

}
