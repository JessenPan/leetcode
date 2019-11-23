package org.jessenpan.leetcode.bfs;

import java.util.List;

/**
 * @author jessenpan
 * tag:tree
 */
public class S559MaximumDepthOfNaryTree {

    public static class Node {

        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }

    public int maxDepth(Node root) {
        countMaxDepth(root, 0);
        return theMaxDepth;
    }

    public void countMaxDepth(Node current, int currentCount) {
        if (current == null) {
            if (currentCount > theMaxDepth) {
                theMaxDepth = currentCount;
            }
            return;
        }
        currentCount++;
        if (current.children == null || current.children.size() == 0) {
            countMaxDepth(null, currentCount);
            return;
        }
        for (Node child : current.children) {
            countMaxDepth(child, currentCount);
        }
    }

    private int theMaxDepth = 0;

}
