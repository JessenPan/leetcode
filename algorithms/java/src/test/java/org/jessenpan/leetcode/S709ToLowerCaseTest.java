package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S709ToLowerCaseTest {

    private S709ToLowerCase toLowerCase = new S709ToLowerCase();

    @Test
    public void test1() {
        String lowerCaseStr = toLowerCase.toLowerCase("Hello");
        assertEquals("hello",lowerCaseStr);
    }

    @Test
    public void test2() {
        String lowerCaseStr = toLowerCase.toLowerCase("here");
        assertEquals("here",lowerCaseStr);
    }

    @Test
    public void test3() {
        String lowerCaseStr = toLowerCase.toLowerCase("LOVELY");
        assertEquals("lovely",lowerCaseStr);
    }

}
