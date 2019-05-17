package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S216CombinationSumIII;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author jessenpan
 */
public class S216CombinationSumIIITest {

    private S216CombinationSumIII combinationSumIII = new S216CombinationSumIII();

    @Test
    public void test1() {
        List<List<Integer>> combinations = combinationSumIII.combinationSum3(3, 7);
        Assert.assertEquals(1, combinations.size());
    }

    @Test
    public void test2() {
        List<List<Integer>> combinations = combinationSumIII.combinationSum3(3, 9);
        Assert.assertEquals(3, combinations.size());
    }

    @Test
    public void test3() {
        List<List<Integer>> combinations = combinationSumIII.combinationSum3(9, 45);
    }

}
