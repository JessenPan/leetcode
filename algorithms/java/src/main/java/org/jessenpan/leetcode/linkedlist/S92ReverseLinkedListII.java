package org.jessenpan.leetcode.linkedlist;

import java.util.Stack;

/**
 * @author jessenpan
 */
public class S92ReverseLinkedListII {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        int i = 0;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        m += 1;
        n += 1;
        ListNode current = newHead;
        while (current != null) {
            i++;
            if (i + 1 == m) {

                current.next = reverse(current.next, m, n);
                break;
            }
            current = current.next;
        }
        return newHead.next;
    }

    private ListNode reverse(ListNode next, int m, int n) {
        int idx = m;
        ListNode leftHead = null;
        Stack<ListNode> stack = new Stack<>();
        while (idx <= n) {
            stack.push(next);
            next = next.next;
            idx++;
        }
        leftHead = next;
        ListNode reversedHead = null, reversedCurrent = null;

        while (!stack.isEmpty()) {
            if (reversedHead == null) {
                reversedHead = reversedCurrent = stack.pop();
            } else {
                reversedCurrent.next = stack.pop();
                reversedCurrent = reversedCurrent.next;
            }
        }
        reversedCurrent.next = leftHead;
        return reversedHead;
    }

}
