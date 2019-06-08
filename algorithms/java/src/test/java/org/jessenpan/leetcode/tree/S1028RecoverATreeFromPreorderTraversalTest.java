package org.jessenpan.leetcode.tree;

import org.jessenpan.leetcode.tree.S1028RecoverATreeFromPreorderTraversal.TreeNode;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1028RecoverATreeFromPreorderTraversalTest {

    private S1028RecoverATreeFromPreorderTraversal recoverATreeFromPreorderTraversal = new S1028RecoverATreeFromPreorderTraversal();

    @Test
    public void test1() {
        TreeNode root = recoverATreeFromPreorderTraversal.recoverFromPreorder("1-2--3--4-5--6--7");
    }

    @Test
    public void test2() {
        TreeNode root = recoverATreeFromPreorderTraversal.recoverFromPreorder("1-2--3---4-5--6---7");
    }

    @Test
    public void test3() {
        TreeNode root = recoverATreeFromPreorderTraversal.recoverFromPreorder("1-401--349---90--88");
    }

}
