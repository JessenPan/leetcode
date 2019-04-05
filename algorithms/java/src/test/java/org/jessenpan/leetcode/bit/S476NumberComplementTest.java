package org.jessenpan.leetcode.bit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S476NumberComplementTest {

    private S476NumberComplement numberComplement = new S476NumberComplement();

    @Test
    public void test1() {
        int complement = numberComplement.findComplement(5);
        assertEquals(2, complement);
    }

    @Test
    public void test2() {
        int complement = numberComplement.findComplement(1);
        assertEquals(0, complement);
    }

}
