package org.jessenpan.leetcode.linkedlist;

/**
 * @author jessenpan
 * tag:linked list
 */
public class S237DeleteNodeInALinkedList {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
