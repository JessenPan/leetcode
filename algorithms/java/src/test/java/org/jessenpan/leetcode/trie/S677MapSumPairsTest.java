package org.jessenpan.leetcode.trie;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S677MapSumPairsTest {

    private S677MapSumPairs.MapSum mapSum = new S677MapSumPairs.MapSum();

    @Test
    public void test1() {
        mapSum.insert("apple", 3);
        int sum = mapSum.sum("ap");
        assertEquals(3, sum);
        mapSum.insert("app", 2);
        sum = mapSum.sum("ap");
        assertEquals(5, sum);
    }

}
