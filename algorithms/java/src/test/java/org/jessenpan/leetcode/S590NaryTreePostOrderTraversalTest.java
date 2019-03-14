package org.jessenpan.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.jessenpan.leetcode.S590NaryTreePostOrderTraversal.*;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S590NaryTreePostOrderTraversalTest {

    private S590NaryTreePostOrderTraversal naryTreePostOrderTraversal = new S590NaryTreePostOrderTraversal();

    @Test
    public void test1() {
        Node node1 = new Node(3, Arrays.asList(new Node(5, null), new Node(6, null)));
        Node root = new Node(1, Arrays.asList(node1, new Node(2, null), new Node(4, null)));

        List<Integer> list = naryTreePostOrderTraversal.postOrder(root);
        assertEquals(Arrays.asList(5, 6, 3, 2, 4, 1), list);
    }

}
