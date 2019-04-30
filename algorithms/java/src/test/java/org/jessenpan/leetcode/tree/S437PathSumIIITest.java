package org.jessenpan.leetcode.tree;

import org.junit.Test;

import static org.jessenpan.leetcode.tree.S437PathSumIII.TreeNode;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S437PathSumIIITest {

    private S437PathSumIII pathSumIII = new S437PathSumIII();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(-2, null, new TreeNode(-3));
        int pathCount = pathSumIII.pathSum(root, -5);
        assertEquals(1, pathCount);
    }

}
