package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S385_MiniParserTest {

    private S385_MiniParser miniParser = new S385_MiniParser();

    @Test
    public void test1() {
        String str1 = "[123,[456,[789]]]";
        String[] replacedArray = str1.replace("[", "").replace("]", "").split(",");
        assertArrayEquals(new String[] { "123", "456", "789" }, replacedArray);
    }

}
