package org.jessenpan.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.jessenpan.leetcode.tree.S894AllPossibleFullBinaryTrees.*;

/**
 * @author jessenpan
 */
public class S894AllPossibleFullBinaryTreesTest {

    private S894AllPossibleFullBinaryTrees allPossibleFullBinaryTrees = new S894AllPossibleFullBinaryTrees();

    @Test
    public void test1() {
        List<TreeNode> trees = allPossibleFullBinaryTrees.allPossibleFBT(7);
        Assert.assertEquals(5, trees.size());
    }

}
