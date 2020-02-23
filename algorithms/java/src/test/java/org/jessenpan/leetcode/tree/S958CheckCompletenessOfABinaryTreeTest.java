package org.jessenpan.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.tree.S958CheckCompletenessOfABinaryTree.TreeNode;

/**
 * @author jessenpan
 */
public class S958CheckCompletenessOfABinaryTreeTest {

    private S958CheckCompletenessOfABinaryTree checkCompletenessOfABinaryTree = new S958CheckCompletenessOfABinaryTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null));
        boolean valid = checkCompletenessOfABinaryTree.isCompleteTree(root);
        Assert.assertTrue(valid);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, null, new TreeNode(7)));
        boolean valid = checkCompletenessOfABinaryTree.isCompleteTree(root);
        Assert.assertFalse(valid);
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(5), null), new TreeNode(3, new TreeNode(7), new TreeNode(8)));
        boolean valid = checkCompletenessOfABinaryTree.isCompleteTree(root);
        Assert.assertFalse(valid);
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(1);
        boolean valid = checkCompletenessOfABinaryTree.isCompleteTree(root);
        Assert.assertTrue(valid);
    }

    @Test
    public void test5() {
        TreeNode node4 = new TreeNode(4, new TreeNode(8, new TreeNode(15), null), new TreeNode(9));
        TreeNode node5 = new TreeNode(5, new TreeNode(10), new TreeNode(11));
        TreeNode node6 = new TreeNode(6, new TreeNode(12), new TreeNode(13));
        TreeNode root = new TreeNode(1, new TreeNode(2, node4, node5), new TreeNode(3, node6, new TreeNode(7)));
        boolean valid = checkCompletenessOfABinaryTree.isCompleteTree(root);
        Assert.assertFalse(valid);
    }

}
