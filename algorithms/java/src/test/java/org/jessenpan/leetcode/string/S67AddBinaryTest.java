package org.jessenpan.leetcode.string;

import org.jessenpan.leetcode.string.S67AddBinary;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S67AddBinaryTest {

    private S67AddBinary addBinary = new S67AddBinary();

    @Test
    public void test1() {
        String added = addBinary.addBinary("11", "1");
        assertEquals("100", added);
    }

    @Test
    public void test2() {
        String added = addBinary.addBinary("1010", "1011");
        assertEquals("10101", added);
    }
}
