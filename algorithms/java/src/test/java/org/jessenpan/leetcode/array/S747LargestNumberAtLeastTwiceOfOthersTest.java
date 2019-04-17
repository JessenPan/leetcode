package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S747LargestNumberAtLeastTwiceOfOthersTest {

    private S747LargestNumberAtLeastTwiceOfOthers largestNumberAtLeastTwiceOfOthers = new S747LargestNumberAtLeastTwiceOfOthers();

    @Test
    public void test1() {
        int index = largestNumberAtLeastTwiceOfOthers.dominantIndex(new int[] { 3, 6, 1, 0 });
        assertEquals(1, index); 
    }

    @Test
    public void test2() {
        int index = largestNumberAtLeastTwiceOfOthers.dominantIndex(new int[] { 1, 2, 3, 4 });
        assertEquals(-1, index);
    }

}
