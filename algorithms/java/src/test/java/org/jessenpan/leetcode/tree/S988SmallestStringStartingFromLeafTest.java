package org.jessenpan.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.tree.S988SmallestStringStartingFromLeaf.*;

/**
 * @author jessenpan
 */
public class S988SmallestStringStartingFromLeafTest {

    private S988SmallestStringStartingFromLeaf smallestStringStartingFromLeaf = new S988SmallestStringStartingFromLeaf();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(0, new TreeNode(1, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(3), new TreeNode(4)));
        String smallest = smallestStringStartingFromLeaf.smallestFromLeaf(root);
        Assert.assertEquals("dba", smallest);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(25, new TreeNode(1, new TreeNode(1), new TreeNode(3)), new TreeNode(3, new TreeNode(0), new TreeNode(2)));
        String smallest = smallestStringStartingFromLeaf.smallestFromLeaf(root);
        Assert.assertEquals("adz", smallest);
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(21);
        String smallest = smallestStringStartingFromLeaf.smallestFromLeaf(root);
        Assert.assertEquals("v", smallest);
    }

    @Test
    public void test4() {
        TreeNode root = new TreeNode(0,null,new TreeNode(1));
        String smallest = smallestStringStartingFromLeaf.smallestFromLeaf(root);
        Assert.assertEquals("ba", smallest);
    }

}
