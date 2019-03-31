package org.jessenpan.leetcode.tree;

import org.jessenpan.leetcode.S257BinaryTreePaths;
import org.jessenpan.leetcode.S257BinaryTreePaths.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S257BinaryTreePathsTest {

    private S257BinaryTreePaths binaryTreePaths = new S257BinaryTreePaths();

    @Test
    public void test1() {
        TreeNode five = new TreeNode(5);
        TreeNode two = new TreeNode(2, null, five);
        TreeNode root = new TreeNode(1, two, new TreeNode(3, null, null));
        List<String> paths = binaryTreePaths.binaryTreePaths(root);
        assertEquals(Arrays.asList("1->2->5", "1->3"), paths);
    }

}
