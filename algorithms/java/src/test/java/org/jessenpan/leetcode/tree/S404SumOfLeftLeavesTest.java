package org.jessenpan.leetcode.tree;

import org.jessenpan.leetcode.tree.S404SumOfLeftLeaves.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S404SumOfLeftLeavesTest {

    private S404SumOfLeftLeaves sumOfLeftLeaves = new S404SumOfLeftLeaves();

    @Test
    public void test1() {
        TreeNode node1 = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, new TreeNode(9), node1);
        int theSum = sumOfLeftLeaves.sumOfLeftLeaves(root);
        assertEquals(24, theSum);
    }

}
