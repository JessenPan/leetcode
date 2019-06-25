package org.jessenpan.leetcode.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S61RotateList {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        int len = countLen(head);
        k = k % len;
        if (k == 0) {
            return head;
        }
        Queue<ListNode> stack = new LinkedList<>();
        ListNode current = head;

        k = len - k + 1;
        int i = 0;

        ListNode rotatedHead = new ListNode(0);
        ListNode rotatedCurrent = rotatedHead;

        while (current != null) {
            i++;
            if (i + 1 == k) {
                ListNode tmp = current.next;
                while (tmp != null) {
                    stack.offer(tmp);
                    tmp = tmp.next;
                }
                while (!stack.isEmpty()) {
                    rotatedCurrent.next = stack.poll();
                    rotatedCurrent = rotatedCurrent.next;
                }
                rotatedCurrent.next = null;
                break;
            }
            current = current.next;
        }
        current.next = null;
        rotatedCurrent.next = head;
        return rotatedHead.next;
    }

    private int countLen(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

}
