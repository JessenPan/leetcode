package org.jessenpan.leetcode.linkedlist.S206ReverseLinkedList;


/**
 * @author jessenpan
 */
public class InteractivelySolution {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }

    private ListNode reverse(ListNode node) {
        if (node == null) {
            return null;
        }

        ListNode current = node, next;
        ListNode newHead = null;

        while (current != null) {
            next = current.next;
            current.next = newHead;
            newHead = current;
            current = next;
        }
        return newHead;
    }

}
