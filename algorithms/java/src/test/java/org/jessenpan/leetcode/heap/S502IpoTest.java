package org.jessenpan.leetcode.heap;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S502IpoTest {

    private S502Ipo ipo = new S502Ipo();

    @Test
    public void test1() {
        int max = ipo.findMaximizedCapital(2, 0, new int[] { 1, 2, 3 }, new int[] { 0, 1, 1 });
        Assert.assertEquals(4, max);
    }

    @Test
    public void test2() {
        int max = ipo.findMaximizedCapital(1, 0, new int[] { 1, 2, 3 }, new int[] { 1, 1, 2 });
        Assert.assertEquals(0, max);
    }

    @Test
    public void test3() {
        int max = ipo.findMaximizedCapital(1, 2, new int[] { 1, 2, 3 }, new int[] { 1, 1, 2 });
        Assert.assertEquals(5, max);
    }

}
