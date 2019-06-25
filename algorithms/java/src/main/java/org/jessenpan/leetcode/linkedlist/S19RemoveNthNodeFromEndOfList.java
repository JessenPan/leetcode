package org.jessenpan.leetcode.linkedlist;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S19RemoveNthNodeFromEndOfList {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int len = countLen(head);
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode current = newHead;
        int i = 0;
        n = len - n + 1;
        while (current != null) {
            i++;
            if (i == n) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
        return newHead.next;
    }

    private int countLen(ListNode current) {
        int len = 0;
        while (current != null) {
            len++;
            current = current.next;
        }
        return len;
    }

}
