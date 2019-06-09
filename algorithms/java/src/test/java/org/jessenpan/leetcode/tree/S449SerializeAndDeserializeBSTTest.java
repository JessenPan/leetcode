package org.jessenpan.leetcode.tree;

import org.jessenpan.leetcode.tree.S449SerializeAndDeserializeBST.Codec;
import org.jessenpan.leetcode.tree.S449SerializeAndDeserializeBST.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S449SerializeAndDeserializeBSTTest {

    private Codec codec = new Codec();

    @Test
    public void test1() {
        String serialData = codec.serialize(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), null));
        Assert.assertEquals("1,2,_,3,4,", serialData);
        TreeNode root = codec.deserialize(serialData);
    }

    @Test
    public void test2() {
        String serialData = codec.serialize(new TreeNode(0));
        Assert.assertEquals("0,", serialData);
        TreeNode root = codec.deserialize(serialData);
    }

    @Test
    public void test3() {
        String serialData = codec.serialize(new TreeNode(5, new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)), new TreeNode(6)));
        Assert.assertEquals("0,", serialData);
        TreeNode root = codec.deserialize(serialData);
    }

}
