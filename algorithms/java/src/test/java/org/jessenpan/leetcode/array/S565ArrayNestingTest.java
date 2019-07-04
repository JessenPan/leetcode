package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S565ArrayNestingTest {

    private S565ArrayNesting arrayNesting = new S565ArrayNesting();

    @Test
    public void test1() {
        int len = arrayNesting.arrayNesting(new int[] { 5, 4, 0, 3, 1, 6, 2 });
        Assert.assertEquals(4, len);
    }

}
