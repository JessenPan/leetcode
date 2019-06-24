package org.jessenpan.leetcode.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S25ReverseNodesInKGroup {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode newHead = new ListNode(0);
        ListNode newCurrent = newHead;

        ListNode current = head;
        Deque<ListNode> stack = new ArrayDeque<>();
        while (current != null) {

            int i = 0;
            while (i < k && current != null) {
                stack.push(current);
                current = current.next;
                i++;
            }

            boolean isSizeOfk = stack.size() == k;

            while (!stack.isEmpty()) {
                if (isSizeOfk) {
                    newCurrent.next = stack.pop();
                } else {
                    newCurrent.next = stack.pollLast();
                }
                newCurrent = newCurrent.next;
            }
            newCurrent.next = null;
        }

        return newHead.next;
    }

}
