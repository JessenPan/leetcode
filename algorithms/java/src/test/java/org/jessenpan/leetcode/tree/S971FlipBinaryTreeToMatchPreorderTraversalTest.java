package org.jessenpan.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.jessenpan.leetcode.tree.S971FlipBinaryTreeToMatchPreorderTraversal.TreeNode;

/**
 * @author jessenpan
 */
public class S971FlipBinaryTreeToMatchPreorderTraversalTest {

    private S971FlipBinaryTreeToMatchPreorderTraversal flipBinaryTreeToMatchPreorderTraversal = new S971FlipBinaryTreeToMatchPreorderTraversal();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        List<Integer> list = flipBinaryTreeToMatchPreorderTraversal.flipMatchVoyage(root, new int[] { 1, 3, 2 });
        Assert.assertEquals(Arrays.asList(1), list);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        List<Integer> list = flipBinaryTreeToMatchPreorderTraversal.flipMatchVoyage(root, new int[] { 1, 2, 3 });
        Assert.assertEquals(Collections.emptyList(), list);
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(2, new TreeNode(1, new TreeNode(4), new TreeNode(3)), null);
        List<Integer> list = flipBinaryTreeToMatchPreorderTraversal.flipMatchVoyage(root, new int[] { 2, 1, 3, 4 });
        Assert.assertEquals(Arrays.asList(1), list);
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(5, new TreeNode(1), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        List<Integer> list = flipBinaryTreeToMatchPreorderTraversal.flipMatchVoyage(root, new int[] { 5, 2, 3, 4, 1 });
        Assert.assertEquals(Arrays.asList(5,2), list);
    }

}
