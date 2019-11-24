package org.jessenpan.leetcode.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S164MaximumGapTest {

    private S164MaximumGap maximumGap = new S164MaximumGap();

    @Test
    public void test1() {
        int t = maximumGap.maximumGap(new int[] { 3, 6, 9, 1 });
        Assert.assertEquals(3, t);
    }


    @Test
    public void test2() {
        int t = maximumGap.maximumGap(new int[] { 10 });
        Assert.assertEquals(0, t);
    }

}
