package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S79WordSearch;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S79WordSearchTest {

    private S79WordSearch wordSearch = new S79WordSearch();

    @Test
    public void test1() {
        boolean isExisted = wordSearch.exist(new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } }, "ABCCED");
        Assert.assertTrue(isExisted);
    }

    @Test
    public void test2() {
        boolean isExisted = wordSearch.exist(new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } }, "SEE");
        Assert.assertTrue(isExisted);
    }

    @Test
    public void test3() {
        boolean isExisted = wordSearch.exist(new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } }, "ABCB");
        Assert.assertFalse(isExisted);
    }

    @Test
    public void test4() {
        boolean isExisted = wordSearch.exist(new char[][] { { 'a' } }, "a");
        Assert.assertTrue(isExisted);
    }

}
