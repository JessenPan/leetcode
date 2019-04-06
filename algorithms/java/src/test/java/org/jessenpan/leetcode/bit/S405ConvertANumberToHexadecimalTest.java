package org.jessenpan.leetcode.bit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S405ConvertANumberToHexadecimalTest {

    private S405ConvertANumberToHexadecimal convertANumberToHexadecimal = new S405ConvertANumberToHexadecimal();

    @Test
    public void test() {
        String hex = convertANumberToHexadecimal.toHex(26);
        assertEquals("1a", hex);
    }

    @Test
    public void test2() {
        String hex = convertANumberToHexadecimal.toHex(-1);
        assertEquals("ffffffff", hex);
    }

}
