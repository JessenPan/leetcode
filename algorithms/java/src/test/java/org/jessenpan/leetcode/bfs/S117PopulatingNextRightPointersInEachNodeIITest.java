package org.jessenpan.leetcode.bfs;

import org.junit.Test;

import static org.jessenpan.leetcode.bfs.S117PopulatingNextRightPointersInEachNodeII.*;

/**
 * @author jessenpan
 */
public class S117PopulatingNextRightPointersInEachNodeIITest {

    private S117PopulatingNextRightPointersInEachNodeII populatingNextRightPointersInEachNodeII = new S117PopulatingNextRightPointersInEachNodeII();

    @Test
    public void test1() {
        Node root = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, null, new Node(7)));
        populatingNextRightPointersInEachNodeII.connect(root);
    }

}
