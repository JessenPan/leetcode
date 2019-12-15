package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S504Base7Test {

    private S504Base7 base7 = new S504Base7();

    @Test
    public void test1() {
        String base7Str = base7.convertToBase7(100);
        Assert.assertEquals("202", base7Str);
    }

    @Test
    public void test2() {
        String base7Str = base7.convertToBase7(-7);
        Assert.assertEquals("-10", base7Str);
    }

}
