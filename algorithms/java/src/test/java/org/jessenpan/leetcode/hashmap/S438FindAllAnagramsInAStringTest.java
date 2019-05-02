package org.jessenpan.leetcode.hashmap;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S438FindAllAnagramsInAStringTest {

    private S438FindAllAnagramsInAString findAllAnagramsInAString = new S438FindAllAnagramsInAString();

    @Test
    public void test1() {
        List<Integer> indexs = findAllAnagramsInAString.findAnagrams("cbaebabacd", "abc");
        assertEquals(asList(0, 6), indexs);
    }

    @Test
    public void test2() {
        List<Integer> indexs = findAllAnagramsInAString.findAnagrams("abab", "ab");
        assertEquals(asList(0, 1,2), indexs);
    }

}
