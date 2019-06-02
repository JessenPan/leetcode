package org.jessenpan.leetcode.trie;

import org.jessenpan.leetcode.trie.S745PrefixAndSuffixSearch.WordFilter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S745PrefixAndSuffixSearchTest {

    @Test
    public void test1() {

        WordFilter wordFilter = new WordFilter(new String[] { "apple" });
        int weight = wordFilter.f("a", "e");
        assertEquals(0, weight);
        weight = wordFilter.f("b", "");
        assertEquals(-1, weight);
    }

}
