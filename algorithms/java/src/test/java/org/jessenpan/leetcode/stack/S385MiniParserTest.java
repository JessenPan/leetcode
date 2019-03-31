package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S385MiniParserTest {

    private S385MiniParser miniParser = new S385MiniParser();

    @Test
    public void test1() {
        String str1 = "[123,[456,[789]]]";
        String[] replacedArray = str1.replace("[", "").replace("]", "").split(",");
        assertArrayEquals(new String[] { "123", "456", "789" }, replacedArray);
    }

}
