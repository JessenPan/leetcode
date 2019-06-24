package org.jessenpan.leetcode.linkedlist;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S430FlattenAMultilevelDoublyLinkedList {

    public static class Node {

        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node() {}

        public Node(int _val, Node _prev, Node _next, Node _child) {
            val = _val;
            prev = _prev;
            next = _next;
            child = _child;
        }
    }

    public Node flatten(Node head) {
        Node newHead, newCurrent;
        newHead = newCurrent = new Node(0, null, null, null);
        newHead.next = traverse(newCurrent, head);
        return newHead.next;
    }

    private Node traverse(Node newCurrent, Node oldCurrent) {

        return null;
    }

}
