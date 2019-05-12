package org.jessenpan.leetcode.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jessenpan
 * tag:depth
 */
public class S117PopulatingNextRightPointersInEachNodeII {

    public static class Node {

        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node(int x) {
            this.val = x;
        }

        public Node() {}

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        Node separator = new Node();
        queue.offer(root);
        queue.offer(separator);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node != separator) {
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                if (queue.peek() != null && queue.peek() != separator) {
                    node.next = queue.peek();
                } else if (queue.peek() != null && queue.peek() == separator) {
                    queue.offer(separator);
                }
            }
        }
        return root;
    }

}
