package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S319BulbSwitcherTest {

    private S319BulbSwitcher bulbSwitcher = new S319BulbSwitcher();

    @Test
    public void test1() {
        int n = bulbSwitcher.bulbSwitch(3);
        Assert.assertEquals(1, n);
    }

}
