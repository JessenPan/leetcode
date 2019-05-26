package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S212WordSearchII;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S212WordSearchIITest {

    private S212WordSearchII wordSearchII = new S212WordSearchII();

    @Test
    public void test1() {
        List<String> words = wordSearchII.findWords(new char[][] { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' }, { 'i', 'f', 'l', 'v' } }, new String[] { "oath", "pea", "eat", "rain" });
        Assert.assertEquals(Arrays.asList("eat", "oath"), words);
    }

}
