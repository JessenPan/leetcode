package org.jessenpan.leetcode.map;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S982TriplesWithBitwiseAndEqualToZeroTest {

    private S982TriplesWithBitwiseAndEqualToZero triplesWithBitwiseAndEqualToZero = new S982TriplesWithBitwiseAndEqualToZero();

    @Test
    public void test1() {
        int t = triplesWithBitwiseAndEqualToZero.countTriplets(new int[] { 2, 1, 3 });
        Assert.assertEquals(12, t);
    }

}
