package org.jessenpan.leetcode.tree;

import org.junit.Test;

import static org.jessenpan.leetcode.tree.S235LowestCommonAncestorOfABinarySearchTree.TreeNode;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S235LowestCommonAncestorOfABinarySearchTreeTest {

    private S235LowestCommonAncestorOfABinarySearchTree lowestCommonAncestorOfABinarySearchTree = new S235LowestCommonAncestorOfABinarySearchTree();

    private TreeNode root = new TreeNode(6, new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))), new TreeNode(8, new TreeNode(7), new TreeNode(9)));

    @Test
    public void test1() {
        TreeNode node = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8));
        assertEquals(6, node.val);
    }

    @Test
    public void test2() {
        TreeNode node = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4));
        assertEquals(2, node.val);
    }

    @Test
    public void test3() {
        TreeNode node = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, new TreeNode(5), new TreeNode(3));
        assertEquals(4, node.val);
    }

    @Test
    public void test4() {
        TreeNode node = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, new TreeNode(5), new TreeNode(4));
        assertEquals(4, node.val);
    }

}
