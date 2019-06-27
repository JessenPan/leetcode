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

        public Node(int x) {
            this.val = x;
        }

        public Node(int x, Node next) {
            this.val = x;
            this.next = next;
        }

        public Node(int _val, Node _prev, Node _next, Node _child) {
            val = _val;
            prev = _prev;
            next = _next;
            child = _child;
        }
    }

    Node theEnd;

    public Node flatten(Node head) {
        Node current = head;

        while (current != null) {
            if (current.child != null) {

                flatten(current.child);
                Node next = current.next;
                current.next = current.child;
                current.child = null;
                theEnd.next = next;
            } else {
                current = current.next;
            }
            if (current != null && current.next == null && current.child == null) {
                theEnd = current;
            }
        }
        return head;
    }

}
