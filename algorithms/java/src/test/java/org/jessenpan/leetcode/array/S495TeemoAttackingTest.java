package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S495TeemoAttackingTest {

    private S495TeemoAttacking teemoAttacking = new S495TeemoAttacking();

    @Test
    public void test1() {
        int allDuration = teemoAttacking.findPoisonedDuration(new int[] { 1, 4 }, 2);
        Assert.assertEquals(4, allDuration);
    }

    @Test
    public void test2() {
        int allDuration = teemoAttacking.findPoisonedDuration(new int[] { 1, 2 }, 2);
        Assert.assertEquals(3, allDuration);
    }

}
