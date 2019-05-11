package org.jessenpan.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.jessenpan.leetcode.tree.S145BinaryTreePostorderTraversal.TreeNode;

/**
 * @author jessenpan
 */
public class S145BinaryTreePostorderTraversalTest {

    private S145BinaryTreePostorderTraversal binaryTreePostorderTraversal = new S145BinaryTreePostorderTraversal();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        List<Integer> list = binaryTreePostorderTraversal.postorderTraversal(root);
        Assert.assertEquals(Arrays.asList(2, 4, 5, 3, 1), list);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1,null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> list = binaryTreePostorderTraversal.postorderTraversal(root);
        Assert.assertEquals(Arrays.asList(3, 2, 1), list);
    }

}
