package org.jessenpan.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.tree.S623AddOneRowToTree.*;

/**
 * @author jessenpan
 */
public class S623AddOneRowToTreeTest {

    private S623AddOneRowToTree addOneRowToTree = new S623AddOneRowToTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(1)), new TreeNode(6, new TreeNode(5), null));
        TreeNode newRoot = addOneRowToTree.addOneRow(root, 1, 2);
        Assert.assertEquals(4, newRoot.val);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(1)), null);
        TreeNode newRoot = addOneRowToTree.addOneRow(root, 1, 2);
        Assert.assertEquals(4, newRoot.val);
    }

}
