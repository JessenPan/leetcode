package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S1010PairsOfSongsWithTotalDurationsDivisibleBy60Test {

    private S1010PairsOfSongsWithTotalDurationsDivisibleBy60 pairsOfSongsWithTotalDurationsDivisibleBy60 = new S1010PairsOfSongsWithTotalDurationsDivisibleBy60();

    @Test
    public void test1() {
        int times = pairsOfSongsWithTotalDurationsDivisibleBy60.numPairsDivisibleBy60(new int[] { 30, 20, 150, 100, 40 });
        assertEquals(3, times);
    }

    @Test
    public void test2() {
        int times = pairsOfSongsWithTotalDurationsDivisibleBy60.numPairsDivisibleBy60(new int[] { 60, 60, 60 });
        assertEquals(3, times);
    }

}
