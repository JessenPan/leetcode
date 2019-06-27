package org.jessenpan.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 */
public class S138CopyListWithRandomPointer {

    public static class Node {

        public int val;
        public Node next;
        public Node random;

        public Node() {}

        public Node(int _val, Node _next, Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    }

    public Node copyRandomList(Node head) {
        Map<Node, Node> copiedMap = new HashMap<>();

        Node copiedHead = new Node();
        Node current = copiedHead;

        while (head != null) {

            Node copiedNode = new Node(head.val, null, head.random);
            copiedMap.put(head, copiedNode);
            current.next = copiedNode;
            current = current.next;
            head = head.next;
        }

        copiedHead = copiedHead.next;
        current = copiedHead;
        while (current != null) {

            if (current.random != null) {
                current.random = copiedMap.get(current.random);
            }
            current = current.next;
        }

        return copiedHead;
    }

}
