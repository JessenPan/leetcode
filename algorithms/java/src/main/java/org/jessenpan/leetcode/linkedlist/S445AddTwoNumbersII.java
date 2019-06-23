package org.jessenpan.leetcode.linkedlist;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S445AddTwoNumbersII {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = convert2Stack(l1);
        Stack<Integer> s2 = convert2Stack(l2);
        ListNode head = null;
        int carry = 0;

        while (!s1.isEmpty() || !s2.isEmpty()) {
            int val = 0;
            if (!s1.isEmpty()) {
                val += s1.pop();
            }
            if (!s2.isEmpty()) {
                val += s2.pop();
            }
            val += carry;
            carry = val >= 10 ? 1 : 0;
            val = val >= 10 ? (val - 10) : val;
            ListNode v = new ListNode(val);
            v.next = head;
            head = v;
        }
        if (carry == 1) {
            ListNode v = new ListNode(carry);
            v.next = head;
            head = v;
        }

        return head;

    }

    private Stack<Integer> convert2Stack(ListNode l) {
        Stack<Integer> stack = new Stack<>();
        while (l != null) {
            stack.push(l.val);
            l = l.next;
        }
        return stack;
    }

}
