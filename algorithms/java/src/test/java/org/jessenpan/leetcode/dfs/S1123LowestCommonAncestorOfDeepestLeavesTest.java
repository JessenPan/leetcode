package org.jessenpan.leetcode.dfs;

import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.dfs.S1123LowestCommonAncestorOfDeepestLeaves.*;

/**
 * @author jessenpan
 */
public class S1123LowestCommonAncestorOfDeepestLeavesTest {

    private S1123LowestCommonAncestorOfDeepestLeaves lowestCommonAncestorOfDeepestLeaves = new S1123LowestCommonAncestorOfDeepestLeaves();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode lca = lowestCommonAncestorOfDeepestLeaves.lcaDeepestLeaves(root);
        Assert.assertEquals(root, lca);
    }

    @Test
    public void test2() {
        TreeNode node4 = new TreeNode(4);
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3, node4, null));
        TreeNode lca = lowestCommonAncestorOfDeepestLeaves.lcaDeepestLeaves(root);
        Assert.assertEquals(node4, lca);
    }

    @Test
    public void test3() {
        TreeNode node2 = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        TreeNode root = new TreeNode(1, node2, new TreeNode(3));
        TreeNode lca = lowestCommonAncestorOfDeepestLeaves.lcaDeepestLeaves(root);
        Assert.assertEquals(node2, lca);
    }

    @Test
    public void test4() {
        TreeNode node2 = new TreeNode(2, new TreeNode(3, null, new TreeNode(6)), new TreeNode(4, null, new TreeNode(5)));
        TreeNode root = new TreeNode(1, node2, null);
        TreeNode lca = lowestCommonAncestorOfDeepestLeaves.lcaDeepestLeaves(root);
        Assert.assertEquals(node2, lca);
    }

}
