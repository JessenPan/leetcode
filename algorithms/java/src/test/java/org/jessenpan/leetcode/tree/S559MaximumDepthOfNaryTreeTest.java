package org.jessenpan.leetcode.tree;

import org.jessenpan.leetcode.S559MaximumDepthOfNaryTree;
import org.jessenpan.leetcode.S559MaximumDepthOfNaryTree.Node;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S559MaximumDepthOfNaryTreeTest {

    private S559MaximumDepthOfNaryTree maximumDepthOfNaryTree = new S559MaximumDepthOfNaryTree();
    
    @Test
    public void test1(){
        Node node1 = new Node(3, Arrays.asList(new Node(5, null), new Node(6, null)));
        Node root = new Node(1, Arrays.asList(node1, new Node(2, null), new Node(4, null)));

        int theMaxDepth = maximumDepthOfNaryTree.maxDepth(root);
        assertEquals(3, theMaxDepth);
    }

}
