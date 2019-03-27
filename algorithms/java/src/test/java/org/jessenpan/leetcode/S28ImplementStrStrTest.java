package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S28ImplementStrStrTest {

    private S28ImplementStrStr implementStrStr = new S28ImplementStrStr();

    @Test
    public void test1() {
        int index = implementStrStr.strStr("hello", "ll");
        assertEquals(index, 2);
    }

    @Test
    public void test2() {
        int index = implementStrStr.strStr("aaaaa", "bba");
        assertEquals(index, -1);
    }

    @Test
    public void test3() {
        int index = implementStrStr.strStr("aaa", "aaaa");
        assertEquals(index, -1);
    }

}
