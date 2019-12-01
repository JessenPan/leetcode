package org.jessenpan.leetcode.dfs;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.jessenpan.leetcode.dfs.S1110DeleteNodesAndReturnForest.TreeNode;

/**
 * @author jessenpan
 */
public class S1110DeleteNodesAndReturnForestTest {

    private S1110DeleteNodesAndReturnForest deleteNodesAndReturnForest = new S1110DeleteNodesAndReturnForest();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        List<TreeNode> trees = deleteNodesAndReturnForest.delNodes(root, new int[] { 3, 5 });
        Assert.assertEquals(3, trees.size());
    }

}
