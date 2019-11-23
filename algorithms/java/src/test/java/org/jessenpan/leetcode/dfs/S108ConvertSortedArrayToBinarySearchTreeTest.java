package org.jessenpan.leetcode.dfs;

import org.junit.Test;

/**
 * @author jessenpan
 */
public class S108ConvertSortedArrayToBinarySearchTreeTest {

    private S108ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree = new S108ConvertSortedArrayToBinarySearchTree();
    
    @Test
    public void test1(){
        convertSortedArrayToBinarySearchTree.sortedArrayToBST(new int[] { -10, -3, 0, 5, 9 });
    }
    
}
