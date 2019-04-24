package org.jessenpan.leetcode.tree;

import org.jessenpan.leetcode.tree.S530MinimumAbsoluteDifferenceInBST.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S530MinimumAbsoluteDifferenceInBSTTest {

    private S530MinimumAbsoluteDifferenceInBST minimumAbsoluteDifferenceInBST = new S530MinimumAbsoluteDifferenceInBST();

    @Test
    public void test1() {
        TreeNode node3 = new TreeNode(3, new TreeNode(2), null);
        TreeNode node1 = new TreeNode(1, null, node3);
        int min = minimumAbsoluteDifferenceInBST.getMinimumDifference(node1);
        assertEquals(1, min);
    }

}
