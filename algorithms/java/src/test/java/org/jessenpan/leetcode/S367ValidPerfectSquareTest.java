package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * @author jessenpan
 */
public class S367ValidPerfectSquareTest {

    private S367ValidPerfectSquare validPerfectSquare = new S367ValidPerfectSquare();

    @Test
    public void test1() {
        boolean isPrefect = validPerfectSquare.isPerfectSquare(2147483647);
        assertFalse(isPrefect);
    }

}
