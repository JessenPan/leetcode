package org.jessenpan.leetcode.doublepointer;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1004MaxConsecutiveOnesIIITest {

    private S1004MaxConsecutiveOnesIII maxConsecutiveOnesIII = new S1004MaxConsecutiveOnesIII();

    @Test
    public void test1() {
        int len = maxConsecutiveOnesIII.longestOnes(new int[] { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 }, 2);
        Assert.assertEquals(6, len);
    }

    @Test
    public void test2() {
        int len = maxConsecutiveOnesIII.longestOnes(new int[] { 0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1 }, 3);
        Assert.assertEquals(10, len);
    }

}
