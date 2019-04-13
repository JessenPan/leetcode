package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S1013PartitionArrayIntoThreePartsWithEqualSumTest {

    private S1013PartitionArrayIntoThreePartsWithEqualSum partitionArrayIntoThreePartsWithEqualSum = new S1013PartitionArrayIntoThreePartsWithEqualSum();

    @Test
    public void test1() {
        boolean isCanThree = partitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(new int[] { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1 });
        assertTrue(isCanThree);
    }

    @Test
    public void test2() {
        boolean isCanThree = partitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(new int[] {0,2,1,-6,6,7,9,-1,2,0,1 });
        assertFalse(isCanThree);
    }

    @Test
    public void test3() {
        boolean isCanThree = partitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(new int[] {3,3,6,5,-2,2,5,1,-9,4 });
        assertTrue(isCanThree);
    }

}
