package org.jessenpan.leetcode.recursion;

import org.junit.Test;

import static org.jessenpan.leetcode.recursion.S687LongestUnivaluePath.TreeNode;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S687LongestUnivaluePathTest {

    private S687LongestUnivaluePath longestUnivaluePath = new S687LongestUnivaluePath();

    @Test
    public void test() {
        TreeNode node4 = new TreeNode(4, new TreeNode(1), new TreeNode(1));
        TreeNode node5 = new TreeNode(5, null, new TreeNode(5));
        TreeNode node = new TreeNode(5, node4, node5);
        int path = longestUnivaluePath.longestUnivaluePath(node);
        assertEquals(2, path);
    }

    @Test
    public void test1() {
        TreeNode node4 = new TreeNode(4, new TreeNode(4), new TreeNode(4));
        TreeNode node5 = new TreeNode(5, null, new TreeNode(5));
        TreeNode node = new TreeNode(1, node4, node5);
        int path = longestUnivaluePath.longestUnivaluePath(node);
        assertEquals(2, path);
    }

}
