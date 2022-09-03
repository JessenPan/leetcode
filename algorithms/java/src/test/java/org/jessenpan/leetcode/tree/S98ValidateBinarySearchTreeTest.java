package org.jessenpan.leetcode.tree;

import org.jessenpan.leetcode.tree.S98ValidateBinarySearchTree.S98ValidateBinarySearchTree;
import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.tree.S98ValidateBinarySearchTree.S98ValidateBinarySearchTree.*;

/**
 * @author jessenpan
 */
public class S98ValidateBinarySearchTreeTest {

    private S98ValidateBinarySearchTree validateBinarySearchTree = new S98ValidateBinarySearchTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(-10, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        boolean isValid = validateBinarySearchTree.isValidBST(root);
        Assert.assertFalse(isValid);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        boolean isValid = validateBinarySearchTree.isValidBST(root);
        Assert.assertFalse(isValid);
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(1, new TreeNode(1), null);
        boolean isValid = validateBinarySearchTree.isValidBST(root);
        Assert.assertFalse(isValid);
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(1, new TreeNode(1), null);
        boolean isValid = validateBinarySearchTree.isValidBST(root);
        Assert.assertFalse(isValid);
    }

}
