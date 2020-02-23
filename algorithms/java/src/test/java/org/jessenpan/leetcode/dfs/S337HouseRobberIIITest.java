package org.jessenpan.leetcode.dfs;

import org.jessenpan.leetcode.dfs.S337HouseRobberIII.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S337HouseRobberIIITest {

    private S337HouseRobberIII houseRobberIII = new S337HouseRobberIII();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3, new TreeNode(2, null, new TreeNode(3)), new TreeNode(3, null, new TreeNode(1)));
        int t = houseRobberIII.rob(root);
        Assert.assertEquals(7, t);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(3)), new TreeNode(5, null, new TreeNode(1)));
        int t = houseRobberIII.rob(root);
        Assert.assertEquals(9, t);
    }

}
