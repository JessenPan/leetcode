package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S96UniqueBinarySearchTreesTest {

    private S96UniqueBinarySearchTrees uniqueBinarySearchTrees = new S96UniqueBinarySearchTrees();

    @Test
    public void test1() {
        int num = uniqueBinarySearchTrees.numTrees(3);
        Assert.assertEquals(5, num);
    }

}
