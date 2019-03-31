package org.jessenpan.leetcode.bit;

import org.jessenpan.leetcode.S268MissingNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S268MissingNumberTest {

    private S268MissingNumber missingNumber = new S268MissingNumber();

    @Test
    public void test() {
        int number = missingNumber.missingNumber(new int[] { 3, 0, 1 });
        assertEquals(2, number);
    }

    @Test
    public void test1() {
        int number = missingNumber.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 });
        assertEquals(8, number);
    }
}
