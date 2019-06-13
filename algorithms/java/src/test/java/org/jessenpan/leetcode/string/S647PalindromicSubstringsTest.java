package org.jessenpan.leetcode.string;

import org.junit.Test;

/**
 * @author jessenpan
 */
public class S647PalindromicSubstringsTest {

    private S647PalindromicSubstrings palindromicSubstrings = new S647PalindromicSubstrings();

    @Test
    public void test1() {
        int count = palindromicSubstrings.countSubstrings("abc");
        System.out.println(count);
    }

    @Test
    public void test2() {
        int count = palindromicSubstrings.countSubstrings("aaa");
        System.out.println(count);
    }

}
