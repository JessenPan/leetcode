package org.jessenpan.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.jessenpan.leetcode.tree.S652FindDuplicateSubtrees.TreeNode;

/**
 * @author jessenpan
 */
public class S652FindDuplicateSubtreesTest {

    private S652FindDuplicateSubtrees findDuplicateSubtrees = new S652FindDuplicateSubtrees();
    
    @Test
    public void test1(){
        TreeNode root = new TreeNode(0, new TreeNode(0, new TreeNode(0), null), new TreeNode(0, null, new TreeNode(0, null, new TreeNode(0))));
        List<TreeNode> list= findDuplicateSubtrees.findDuplicateSubtrees(root);
        Assert.assertEquals(1, list.size());
    }
    
}
