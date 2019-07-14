package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1052GrumpyBookstoreOwnerTest {

    private S1052GrumpyBookstoreOwner grumpyBookstoreOwner = new S1052GrumpyBookstoreOwner();

    @Test
    public void test1() {
        int max = grumpyBookstoreOwner.maxSatisfied(new int[] { 1, 0, 1, 2, 1, 1, 7, 5 }, new int[] { 0, 1, 0, 1, 0, 1, 0, 1 }, 3);
        Assert.assertEquals(16, max);
    }

}
