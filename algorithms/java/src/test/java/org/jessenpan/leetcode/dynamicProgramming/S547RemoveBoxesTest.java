package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S547RemoveBoxesTest {

    private S547RemoveBoxes removeBoxes = new S547RemoveBoxes();

    @Test
    public void test1() {
        int v = removeBoxes.removeBoxes(new int[] { 1, 3, 2, 2, 2, 3, 4, 3, 1 });
        Assert.assertEquals(23, v);
    }

}
