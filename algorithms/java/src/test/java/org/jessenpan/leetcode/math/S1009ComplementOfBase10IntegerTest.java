package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S1009ComplementOfBase10IntegerTest {

    private S1009ComplementOfBase10Integer complementOfBase10Integer = new S1009ComplementOfBase10Integer();

    @Test
    public void test1() {
        int complemented = complementOfBase10Integer.bitwiseComplement(5);
        assertEquals(2, complemented);
    }

    @Test
    public void test2() {
        int complemented = complementOfBase10Integer.bitwiseComplement(7);
        assertEquals(0, complemented);
    }

    @Test
    public void test3() {
        int complemented = complementOfBase10Integer.bitwiseComplement(10);
        assertEquals(5, complemented);
    }

}
