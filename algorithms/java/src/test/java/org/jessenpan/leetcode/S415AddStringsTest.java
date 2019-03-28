package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S415AddStringsTest {

    private S415AddStrings addStrings = new S415AddStrings();

    @Test
    public void test1() {
        String sum = addStrings.addStrings("567", "789");
        assertEquals("1356", sum);
    }

}
