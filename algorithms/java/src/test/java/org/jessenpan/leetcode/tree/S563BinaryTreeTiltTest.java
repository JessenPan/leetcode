package org.jessenpan.leetcode.tree;

import org.junit.Test;

import static org.jessenpan.leetcode.tree.S563BinaryTreeTilt.TreeNode;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S563BinaryTreeTiltTest {

    private S563BinaryTreeTilt binaryTreeTilt = new S563BinaryTreeTilt();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(5));
        int tilt = binaryTreeTilt.findTilt(root);
        assertEquals(5, tilt);
    }

}
