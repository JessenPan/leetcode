package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S334IncreasingTripletSubsequenceTest {

    private S334IncreasingTripletSubsequence increasingTripletSubsequence = new S334IncreasingTripletSubsequence();

    @Test
    public void test1() {
        boolean valid = increasingTripletSubsequence.increasingTriplet(new int[] { 1, 2, 3, 4, 5 });
        Assert.assertTrue(valid);
    }

    @Test
    public void test2() {
        boolean valid = increasingTripletSubsequence.increasingTriplet(new int[] { 5, 4, 3, 2, 1 });
        Assert.assertFalse(valid);
    }

    @Test
    public void test3() {
        boolean valid = increasingTripletSubsequence.increasingTriplet(new int[] { 1,9,7,8,9 });
        Assert.assertTrue(valid);
    }

}
