package org.jessenpan.leetcode.linkedlist;

/**
 * @author jessenpan
 * tag:linked list
 */
public class S141LinkedListCycle {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode step1Node, step2Node;
        step1Node = step2Node = head;
        while (step1Node != null && step2Node != null) {
            step1Node = step1Node.next;
            if (step2Node.next != null) {
                step2Node = step2Node.next.next;
            } else {
                step2Node = null;
            }
            if (step1Node == step2Node) {
                return true;
            }
        }
        return false;
    }

}
