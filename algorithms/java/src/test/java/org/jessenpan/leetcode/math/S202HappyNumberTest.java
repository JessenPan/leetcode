package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S202HappyNumberTest {

    private S202HappyNumber happyNumber = new S202HappyNumber();

    @Test
    public void test() {
        boolean isHappy = happyNumber.isHappy(19);
        assertTrue(isHappy);
    }

    @Test
    public void test1() {
        boolean isHappy = happyNumber.isHappy(19);
        System.out.println(isHappy);
    }

}
