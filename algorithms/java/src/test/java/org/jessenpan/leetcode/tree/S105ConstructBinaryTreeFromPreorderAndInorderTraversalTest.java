package org.jessenpan.leetcode.tree;

import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.tree.S105ConstructBinaryTreeFromPreorderAndInorderTraversal.*;

/**
 * @author jessenpan
 */
public class S105ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    private S105ConstructBinaryTreeFromPreorderAndInorderTraversal constructBinaryTreeFromPreorderAndInorderTraversal = new S105ConstructBinaryTreeFromPreorderAndInorderTraversal();
    
    @Test
    public void test1(){
       TreeNode root= constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(new int[] { 3, 9, 20, 15, 7 }, new int[] { 9, 3, 15, 20, 7 });
        Assert.assertEquals(3, root.val);
    }

}
