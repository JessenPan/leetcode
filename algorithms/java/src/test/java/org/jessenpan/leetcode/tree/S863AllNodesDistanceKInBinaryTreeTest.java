package org.jessenpan.leetcode.tree;

import org.junit.Test;

import java.util.List;

import static org.jessenpan.leetcode.tree.S863AllNodesDistanceKInBinaryTree.TreeNode;

/**
 * @author jessenpan
 */
public class S863AllNodesDistanceKInBinaryTreeTest {

    private S863AllNodesDistanceKInBinaryTree allNodesDistanceKInBinaryTree = new S863AllNodesDistanceKInBinaryTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))), new TreeNode(1, new TreeNode(0), new TreeNode(8)));
        List<Integer> list = allNodesDistanceKInBinaryTree.distanceK(root, new TreeNode(5), 2);
        System.out.println(list);
    }

}
