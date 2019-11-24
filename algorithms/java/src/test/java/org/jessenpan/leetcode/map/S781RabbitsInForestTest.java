package org.jessenpan.leetcode.map;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S781RabbitsInForestTest {

    private S781RabbitsInForest rabbitsInForest = new S781RabbitsInForest();

    @Test
    public void test1() {
        int num = rabbitsInForest.numRabbits(new int[] { 1, 1, 2 });
        Assert.assertEquals(5, num);
    }

    @Test
    public void test2() {
        int num = rabbitsInForest.numRabbits(new int[] { 10, 10, 10 });
        Assert.assertEquals(11, num);
    }

    @Test
    public void test3() {
        int num = rabbitsInForest.numRabbits(new int[] {});
        Assert.assertEquals(0, num);
    }

    @Test
    public void test4() {
        int num = rabbitsInForest.numRabbits(new int[] { 1, 0, 1, 0, 0 });
        Assert.assertEquals(5, num);
    }

    @Test
    public void test5() {
        int num = rabbitsInForest.numRabbits(new int[] { 0, 0, 1, 1, 1 });
        Assert.assertEquals(6, num);
    }

}
