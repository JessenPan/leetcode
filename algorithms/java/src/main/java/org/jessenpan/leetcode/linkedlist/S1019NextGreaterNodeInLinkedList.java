package org.jessenpan.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S1019NextGreaterNodeInLinkedList {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    //TODO rewrite this case
    public int[] nextLargerNodes(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        int len = list.size();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int val = list.get(i);
            if (stack.empty() || list.get(stack.peek()) >= val) {
                stack.push(i);
            } else {
                while (!stack.empty() && list.get(stack.peek()) < list.get(i)) {
                    res[stack.pop()] = list.get(i);
                }
                stack.push(i);
            }
        }
        return res;
    }

}
