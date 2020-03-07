package org.jessenpan.leetcode.dfs;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 * @date 2020/3/7 下午11:15
 */
public class S802FindEventualSafeStatesTest {

    private S802FindEventualSafeStates findEventualSafeStates = new S802FindEventualSafeStates();

    @Test
    public void test1() {
        List<Integer> rs = findEventualSafeStates.eventualSafeNodes(new int[][] { { 1, 2 }, { 2, 3 }, { 5 }, { 0 }, { 5 }, {}, {} });
        Assert.assertEquals(Arrays.asList(2, 4, 5, 6), rs);
    }

    @Test
    public void test2() {
        List<Integer> rs = findEventualSafeStates.eventualSafeNodes(new int[][] { {}, { 0, 2, 3, 4 }, { 3 }, { 4 }, {} });
        Assert.assertEquals(Arrays.asList(0,1,2,3,4), rs);
    }

}
