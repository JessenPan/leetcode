package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1105FillingBookcaseShelvesTest {

    private S1105FillingBookcaseShelves fillingBookcaseShelves = new S1105FillingBookcaseShelves();

    @Test
    public void test1() {
        int t = fillingBookcaseShelves.minHeightShelves(new int[][] { { 1, 1 }, { 2, 3 }, { 2, 3 }, { 1, 1 }, { 1, 1 }, { 1, 1 }, { 1, 2 } }, 4);
        Assert.assertEquals(6, t);
    }

}
