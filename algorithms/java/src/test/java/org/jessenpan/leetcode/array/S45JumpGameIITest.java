package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S45JumpGameIITest {

    private S45JumpGameII jumpGameII = new S45JumpGameII();

    @Test
    public void test1() {
        int times = jumpGameII.jump(new int[] { 2, 3, 1, 1, 4 });
        Assert.assertEquals(times, 2);
    }

    @Test
    public void test2() {
        int times = jumpGameII.jump(new int[] { 0 });
        Assert.assertEquals(times, 0);
    }

    @Test
    public void test3() {
        int times = jumpGameII.jump(new int[] { 1, 2, 1, 1, 1 });
        Assert.assertEquals(3, times);
    }

    @Test
    public void test4() {
        int times = jumpGameII.jump(new int[] { 1, 1, 1, 1, 1 });
        Assert.assertEquals(times, 4);
    }

    @Test
    public void test5() {
        int times = jumpGameII.jump(new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 0 });
        Assert.assertEquals(times, 2);
    }

}
