package org.jessenpan.leetcode.tree;

import org.junit.Test;

import static org.jessenpan.leetcode.tree.S814BinaryTreePruning.*;

/**
 * @author jessenpan
 */
public class S814BinaryTreePruningTest {

    private S814BinaryTreePruning binaryTreePruning = new S814BinaryTreePruning();

    @Test
    public void test1() {
        TreeNode origin = new TreeNode(1, null, new TreeNode(0, new TreeNode(0), new TreeNode(1)));
        TreeNode root = binaryTreePruning.pruneTree(origin);
    }

}
