package org.jessenpan.leetcode.stack;

import org.jessenpan.leetcode.stack.S385MiniParser.NestedInteger;
import org.junit.Assert;
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

    @Test
    public void test2() {
        NestedInteger nestedInteger = miniParser.deserialize("[123,[456,[789]]]");
        Integer expected = 123;
        Assert.assertEquals(expected, nestedInteger.getInteger());
    }

    @Test
    public void test3() {
        NestedInteger nestedInteger = miniParser.deserialize("324");
        Integer expected = 324;
        Assert.assertEquals(expected, nestedInteger.getInteger());
    }

    @Test
    public void test4() {
        NestedInteger nestedInteger = miniParser.deserialize("[]");
        Integer expected = 324;
        Assert.assertEquals(expected, nestedInteger.getInteger());
    }

    @Test
    public void test5() {
        NestedInteger nestedInteger = miniParser.deserialize("[[],[],[],[]]");
        Integer expected = 324;
        Assert.assertEquals(expected, nestedInteger.getInteger());
    }

    @Test
    public void test6() {
        NestedInteger nestedInteger = miniParser.deserialize("[-1]");
        Integer expected = -1;
        Assert.assertEquals(expected, nestedInteger.getInteger());
    }
}
