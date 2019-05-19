package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S51NQueens;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author jessenpan
 */
public class S51NQueensTest {

    private S51NQueens nQueens = new S51NQueens();

    @Test
    public void test1() {
        List<List<String>> list = nQueens.solveNQueens(4);
        System.out.println(list);
        Assert.assertEquals(2, list.size());
    }

}
