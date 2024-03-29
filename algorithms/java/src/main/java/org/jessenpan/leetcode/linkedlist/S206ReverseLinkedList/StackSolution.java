package org.jessenpan.leetcode.linkedlist.S206ReverseLinkedList;

import java.util.Stack;

/**
 * @author jessenpan
 */
public class StackSolution {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<ListNode> listNodeStack = new Stack<>();
        while (head != null) {
            listNodeStack.push(head);
            head = head.next;
        }
        ListNode reversedHead = listNodeStack.pop();
        ListNode reversedCurrent = reversedHead;
        while (!listNodeStack.isEmpty()) {
            reversedCurrent.next = listNodeStack.pop();
            reversedCurrent = reversedCurrent.next;
        }
        reversedCurrent.next = null;
        return reversedHead;
    }

}
