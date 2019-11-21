package org.jessenpan.leetcode.recursion;

import org.junit.Test;

import java.util.List;

/**
 * @author jessenpan
 */
public class S797AllPathsFromSourceToTargetTest {

    private S797AllPathsFromSourceToTarget allPathsFromSourceToTarget = new S797AllPathsFromSourceToTarget();

    @Test
    public void test1() {
        List<List<Integer>> list = allPathsFromSourceToTarget.allPathsSourceTarget(new int[][] { { 1, 2 }, { 3 }, { 3 }, {} });
        System.out.println(list);
    }

}
