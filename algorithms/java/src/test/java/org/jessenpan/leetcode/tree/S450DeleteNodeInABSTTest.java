package org.jessenpan.leetcode.tree;

import org.junit.Test;

import static org.jessenpan.leetcode.tree.S450DeleteNodeInABST.*;

/**
 * @author jessenpan
 */
public class S450DeleteNodeInABSTTest {

    private S450DeleteNodeInABST deleteNodeInABST = new S450DeleteNodeInABST();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(6, null, new TreeNode(7)));
        TreeNode newRoot = deleteNodeInABST.deleteNode(root, 3);
    }

}
