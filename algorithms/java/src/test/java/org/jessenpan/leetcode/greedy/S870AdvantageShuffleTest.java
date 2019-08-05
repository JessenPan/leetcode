package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S870AdvantageShuffleTest {

    private S870AdvantageShuffle advantageShuffle = new S870AdvantageShuffle();

    @Test
    public void test1() {
        int[] ads = advantageShuffle.advantageCount(new int[] { 2, 7, 11, 15 }, new int[] { 1, 10, 4, 11 });
        Assert.assertArrayEquals(new int[] { 2, 11, 7, 15 }, ads);
    }

    @Test
    public void test2() {
        int[] ads = advantageShuffle.advantageCount(new int[] { 12, 24, 8, 32 }, new int[] { 13, 25, 32, 11 });
        Assert.assertArrayEquals(new int[] { 24, 32, 8, 12 }, ads);
    }

    @Test
    public void test3() {
        int[] ads = advantageShuffle.advantageCount(new int[] { 718967141, 189971378, 341560426, 23521218, 339517772 }, new int[] { 967482459, 978798455, 744530040, 3454610, 940238504 });
        Assert.assertArrayEquals(new int[] { 718967141, 341560426, 339517772, 23521218, 189971378 }, ads);
    }

}
