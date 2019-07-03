package org.jessenpan.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S1104PathInZigzagLabelledBinaryTreeTest {

    private S1104PathInZigzagLabelledBinaryTree pathInZigzagLabelledBinaryTree = new S1104PathInZigzagLabelledBinaryTree();

    @Test
    public void test1() {
        List<Integer> paths = pathInZigzagLabelledBinaryTree.pathInZigZagTree(14);
        Assert.assertEquals(Arrays.asList(1, 3, 4, 14), paths);
    }

    @Test
    public void test2() {
        List<Integer> paths = pathInZigzagLabelledBinaryTree.pathInZigZagTree(26);
        Assert.assertEquals(Arrays.asList(1, 2, 6, 10, 26), paths);
    }

}
