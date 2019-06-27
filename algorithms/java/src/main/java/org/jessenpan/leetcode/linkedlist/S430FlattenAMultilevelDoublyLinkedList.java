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

    private Node theEnd;

    public Node flatten(Node head) {
        Node current = head;

        while (current != null) {
            if (current.next == null && current.child == null) {
                theEnd = current;
            }
            if (current.child != null) {
                Node child = current.child;
                flatten(current.child);
                Node next = current.next;

                current.next = current.child;
                child.prev = current;
                current.child = null;

                theEnd.next = next;
                if (next != null) {
                    next.prev = theEnd;
                }
            } else {
                current = current.next;
            }

        }
        return head;
    }

}
