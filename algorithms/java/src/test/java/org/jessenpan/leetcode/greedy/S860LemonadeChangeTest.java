package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S860LemonadeChangeTest {

    private S860LemonadeChange lemonadeChange = new S860LemonadeChange();

    @Test
    public void test1() {
        boolean isChanged = lemonadeChange.lemonadeChange(new int[] { 5, 5, 5, 10, 20 });
        Assert.assertTrue(isChanged);
    }

    @Test
    public void test2() {
        boolean isChanged = lemonadeChange.lemonadeChange(new int[] { 5, 5, 10 });
        Assert.assertTrue(isChanged);
    }

    @Test
    public void test3() {
        boolean isChanged = lemonadeChange.lemonadeChange(new int[] { 10, 10 });
        Assert.assertFalse(isChanged);
    }

    @Test
    public void test4() {
        boolean isChanged = lemonadeChange.lemonadeChange(new int[] { 5, 5, 10, 10, 20 });
        Assert.assertFalse(isChanged);
    }

}
