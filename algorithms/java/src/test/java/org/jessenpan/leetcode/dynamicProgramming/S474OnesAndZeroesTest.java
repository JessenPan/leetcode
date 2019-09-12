package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S474OnesAndZeroesTest {

    private S474OnesAndZeroes onesAndZeroes = new S474OnesAndZeroes();

    @Test
    public void test1() {
        int c = onesAndZeroes.findMaxForm(new String[] { "10", "0001", "111001", "1", "0" }, 5, 3);
        Assert.assertEquals(4, c);
    }

    @Test
    public void test2() {
        int c = onesAndZeroes.findMaxForm(new String[] { "10", "0", "1" }, 1, 1);
        Assert.assertEquals(2, c);
    }

}
