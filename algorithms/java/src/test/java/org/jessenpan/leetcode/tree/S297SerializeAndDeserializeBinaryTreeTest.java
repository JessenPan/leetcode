package org.jessenpan.leetcode.tree;

import org.jessenpan.leetcode.tree.S297SerializeAndDeserializeBinaryTree.Codec;
import org.jessenpan.leetcode.tree.S297SerializeAndDeserializeBinaryTree.TreeNode;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S297SerializeAndDeserializeBinaryTreeTest {

    private Codec serializeAndDeserializeBinaryTree = new Codec();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        String str = serializeAndDeserializeBinaryTree.serialize(root);
        System.out.println(str);
        TreeNode rebuildRoot = serializeAndDeserializeBinaryTree.deserialize(str);
        System.out.println(rebuildRoot);
    }

}
