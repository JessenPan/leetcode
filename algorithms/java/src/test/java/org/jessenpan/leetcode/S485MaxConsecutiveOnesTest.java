package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S485MaxConsecutiveOnesTest {

    private S485MaxConsecutiveOnes maxConsecutiveOnes = new S485MaxConsecutiveOnes();

    @Test
    public void test1() {
        int theMaxConsecutiveOne = maxConsecutiveOnes.findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 });
        assertEquals(3, theMaxConsecutiveOne);
    }

}
