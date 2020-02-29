package org.jessenpan.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.tree.S865SmallestSubtreeWithAllTheDeepestNodes.*;

/**
 * @author jessenpan
 */
public class S865SmallestSubtreeWithAllTheDeepestNodesTest {

    private S865SmallestSubtreeWithAllTheDeepestNodes smallestSubtreeWithAllTheDeepestNodes = new S865SmallestSubtreeWithAllTheDeepestNodes();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))), new TreeNode(1, new TreeNode(0), new TreeNode(8)));
        TreeNode sub = smallestSubtreeWithAllTheDeepestNodes.subtreeWithAllDeepest(root);
        Assert.assertEquals(2, sub.val);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(0, new TreeNode(1, null, new TreeNode(2)), new TreeNode(3));
        TreeNode sub = smallestSubtreeWithAllTheDeepestNodes.subtreeWithAllDeepest(root);
        Assert.assertEquals(2, sub.val);
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(0, new TreeNode(2), new TreeNode(1, new TreeNode(3), null));
        TreeNode sub = smallestSubtreeWithAllTheDeepestNodes.subtreeWithAllDeepest(root);
        Assert.assertEquals(3, sub.val);
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(0, new TreeNode(3, new TreeNode(4, null, new TreeNode(6)), null), new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), null));
        TreeNode sub = smallestSubtreeWithAllTheDeepestNodes.subtreeWithAllDeepest(root);
        Assert.assertEquals(0, sub.val);
    }

}
