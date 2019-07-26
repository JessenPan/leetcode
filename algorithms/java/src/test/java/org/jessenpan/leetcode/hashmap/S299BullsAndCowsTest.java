package org.jessenpan.leetcode.hashmap;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S299BullsAndCowsTest {

    private S299BullsAndCows bullsAndCows = new S299BullsAndCows();

    @Test
    public void test1() {
        String bc = bullsAndCows.getHint("1807", "7810");
        Assert.assertEquals("1A3B", bc);
    }

    @Test
    public void test2() {
        String bc = bullsAndCows.getHint("1123", "0111");
        Assert.assertEquals("1A1B", bc);
    }

    @Test
    public void test3() {
        String bc = bullsAndCows.getHint("1", "0");
        Assert.assertEquals("0A0B", bc);
    }

}
