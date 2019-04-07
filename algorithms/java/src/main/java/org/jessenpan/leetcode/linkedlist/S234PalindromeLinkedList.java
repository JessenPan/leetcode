package org.jessenpan.leetcode.linkedlist;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S234PalindromeLinkedList {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        int length = count(head);
        ListNode lHead = reverse(head, length);
        int stepPos = 1 == (length & 1) ? length / 2 + 1 : length / 2;
        ListNode rHead = step(head, stepPos);
        while (lHead != null) {
            if (lHead.val != rHead.val) {
                return false;
            }
            lHead = lHead.next;
            rHead = rHead.next;
        }
        return true;
    }

    private ListNode step(ListNode head, int stepPos) {
        int i = 0;
        ListNode rHead;
        while (i < stepPos) {
            head = head.next;
            i++;
        }
        rHead = head;
        return rHead;
    }

    private ListNode reverse(ListNode current, int length) {
        int rLength = length / 2 - 1, i = 0;
        ListNode newHead = new ListNode(current.val);
        while (i < rLength) {
            ListNode tmp = new ListNode(current.next.val);
            tmp.next=newHead;
            newHead=tmp;
            current = current.next;
            i++;
        }
        return newHead;
    }

    private int count(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
