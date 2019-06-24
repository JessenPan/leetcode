package org.jessenpan.leetcode.linkedlist;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S24SwapNodesInPairs {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode swapedCurrent = new ListNode(0);
        ListNode swapedHead = swapedCurrent;
        while (head != null && head.next != null) {
            ListNode tmp = head.next.next;
            swapedCurrent.next = head.next;
            swapedCurrent = swapedCurrent.next;
            swapedCurrent.next = head;
            swapedCurrent = swapedCurrent.next;
            head = tmp;
        }
        swapedCurrent.next = head;
        return swapedHead.next;
    }

}
