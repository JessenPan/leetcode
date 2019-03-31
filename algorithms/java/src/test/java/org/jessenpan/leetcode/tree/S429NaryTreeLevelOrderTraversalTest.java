package org.jessenpan.leetcode.tree;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.jessenpan.leetcode.S429NaryTreeLevelOrderTraversal.*;

/**
 * @author jessenpan
 */
public class S429NaryTreeLevelOrderTraversalTest {

    private S429NaryTreeLevelOrderTraversal naryTreeLevelOrderTraversal = new S429NaryTreeLevelOrderTraversal();

    @Test
    public void test1() {
        Node node1 = new Node(3, Arrays.asList(new Node(5, null), new Node(6, null)));
        Node root = new Node(1, Arrays.asList(node1, new Node(2, null), new Node(4, null)));

        List<List<Integer>> list = naryTreeLevelOrderTraversal.levelOrder(root);
    }

}
