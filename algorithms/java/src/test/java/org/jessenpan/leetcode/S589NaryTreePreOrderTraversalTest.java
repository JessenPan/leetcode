package org.jessenpan.leetcode;

import org.jessenpan.leetcode.S589NaryTreePreOrderTraversal.Node;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S589NaryTreePreOrderTraversalTest {

    private S589NaryTreePreOrderTraversal naryTreePreOrderTraversal = new S589NaryTreePreOrderTraversal();

    @Test
    public void test1() {
        Node node1 = new Node(3, Arrays.asList(new Node(5, null), new Node(6, null)));
        Node root = new Node(1, Arrays.asList(node1, new Node(2, null), new Node(4, null)));

        List<Integer> list = naryTreePreOrderTraversal.preorder(root);
        assertEquals(Arrays.asList(1, 3, 5, 6, 2, 4), list);
    }

}
