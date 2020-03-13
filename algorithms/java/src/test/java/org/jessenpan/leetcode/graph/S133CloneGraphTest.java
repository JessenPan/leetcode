package org.jessenpan.leetcode.graph;

import org.junit.Test;

import static org.jessenpan.leetcode.graph.S133CloneGraph.*;

/**
 * @author jessenpan
 */
public class S133CloneGraphTest {

    private S133CloneGraph cloneGraph = new S133CloneGraph();

    @Test
    public void test1() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.neighbors.add(node2);
        node2.neighbors.add(node1);
        Node clonedNode1 = cloneGraph.cloneGraph(node1);
        System.out.println(clonedNode1);
    }

}
