package org.jessenpan.leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jessenpan
 * tag:graph
 */
public class S133CloneGraph {

    static class Node {

        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    Map<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        if (visited.get(node) != null) {
            return visited.get(node);
        }
        Node cloned = new Node(node.val);
        visited.put(node, cloned);

        for (Node neighbor : node.neighbors) {
            cloned.neighbors.add(cloneGraph(neighbor));
        }

        return cloned;
    }

}
