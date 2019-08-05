package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S135CandyTest {

    private S135Candy candy = new S135Candy();

    @Test
    public void test1() {
        int n = candy.candy(new int[] { 1, 0, 2 });
        Assert.assertEquals(5, n);
    }

    @Test
    public void test2() {
        int n = candy.candy(new int[] { 1, 2, 2 });
        Assert.assertEquals(4, n);
    }

    @Test
    public void test3() {
        int n = candy.candy(new int[] { 1, 3, 2, 2, 1 });
        Assert.assertEquals(7, n);
    }

}
