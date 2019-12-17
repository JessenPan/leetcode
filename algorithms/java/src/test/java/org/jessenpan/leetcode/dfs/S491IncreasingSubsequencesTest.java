package org.jessenpan.leetcode.dfs;

import org.junit.Test;

import java.util.List;

/**
 * @author jessenpan
 */
public class S491IncreasingSubsequencesTest {

    private S491IncreasingSubsequences increasingSubsequences = new S491IncreasingSubsequences();

    @Test
    public void test1() {
        List<List<Integer>> lists = increasingSubsequences.findSubsequences(new int[] { 4, 6, 7, 7 });
        System.out.println(lists);
    }

}
