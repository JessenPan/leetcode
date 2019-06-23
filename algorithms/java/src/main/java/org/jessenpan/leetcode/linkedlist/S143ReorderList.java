package org.jessenpan.leetcode.linkedlist;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S143ReorderList {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public void reorderList(ListNode head) {
        int len = countLen(head);
        int extractIdx = len / 2;
        Stack<ListNode> stack = new Stack<>();
        int i = 0;
        ListNode current = head;
        while (current != null) {
            i++;

            if (i > extractIdx) {
                stack.push(current);
            }
            if (i == extractIdx) {
                ListNode tmp = current.next;
                current.next = null;
                current = tmp;
            } else {
                current = current.next;
            }
        }

        current = head;

        while (!stack.isEmpty()) {
            ListNode tmp = current.next;
            current.next = stack.pop();
            if (tmp == null && stack.size() == 1) {
                ListNode v = stack.pop();
                current.next.next = v;
                current = v;
            } else {
                current.next.next = tmp;
                current = tmp;
            }
        }
        if (current != null) {
            current.next = null;
        }
    }

    private int countLen(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }

}
