package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S546RemoveBoxesTest {

    private S546RemoveBoxes removeBoxes = new S546RemoveBoxes();

    @Test
    public void test1() {
        int v = removeBoxes.removeBoxes(new int[] { 1, 3, 2, 2, 2, 3, 4, 3, 1 });
        Assert.assertEquals(23, v);
    }

}
