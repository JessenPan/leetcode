package org.jessenpan.leetcode.array;

import org.jessenpan.leetcode.array.S1157OnlineMajorityElementInSubarray.MajorityChecker;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1157OnlineMajorityElementInSubarrayTest {

    @Test
    public void test1() {
        MajorityChecker majorityChecker = new MajorityChecker(new int[] { 1, 1, 2, 2, 1, 1 });
        int v = majorityChecker.query(0, 5, 4);
        Assert.assertEquals(1, v);
        v = majorityChecker.query(0, 3, 3);
        Assert.assertEquals(-1, v);
        v = majorityChecker.query(2, 3, 2);
        Assert.assertEquals(2, v);
    }

}
