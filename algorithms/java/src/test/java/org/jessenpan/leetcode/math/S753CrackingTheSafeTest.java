package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S753CrackingTheSafeTest {

    private S753CrackingTheSafe crackingTheSafe = new S753CrackingTheSafe();

    @Test
    public void test1() {
        String str = crackingTheSafe.crackSafe(1, 2);
        Assert.assertEquals("01", str);
    }

    @Test
    public void test2() {
        String str = crackingTheSafe.crackSafe(2, 2);
        Assert.assertEquals("00110", str);
    }

}
