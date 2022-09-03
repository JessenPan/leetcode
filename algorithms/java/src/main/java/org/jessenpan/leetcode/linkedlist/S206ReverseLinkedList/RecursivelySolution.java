package org.jessenpan.leetcode.linkedlist.S206ReverseLinkedList;

/**
 * @author jessenpan
 * tag:linked list
 */
public class RecursivelySolution {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }

    public ListNode newHead;

    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        recursively(head);
        return newHead;
    }

    private void recursively(ListNode node) {

        if (node.next != null) {
            recursively(node.next);
            node.next.next = node;
            node.next = null;
        } else {
            newHead = node;
        }
    }
}
