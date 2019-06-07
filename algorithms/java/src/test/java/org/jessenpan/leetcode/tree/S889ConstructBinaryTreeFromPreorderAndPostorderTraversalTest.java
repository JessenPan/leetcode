package org.jessenpan.leetcode.tree;

import org.jessenpan.leetcode.tree.S889ConstructBinaryTreeFromPreorderAndPostorderTraversal.TreeNode;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S889ConstructBinaryTreeFromPreorderAndPostorderTraversalTest {

    private S889ConstructBinaryTreeFromPreorderAndPostorderTraversal constructBinaryTreeFromPreorderAndPostorderTraversal = new S889ConstructBinaryTreeFromPreorderAndPostorderTraversal();

    @Test
    public void test1() {
        TreeNode root = constructBinaryTreeFromPreorderAndPostorderTraversal.constructFromPrePost(new int[] { 1, 2, 4, 5, 3, 6, 7 }, new int[] { 4, 5, 2, 6, 7, 3, 1 });
    }

}
