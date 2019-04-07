package org.jessenpan.leetcode.linkedlist;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S160IntersectionOfTwoLinkedLists {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode rHeadA = reverseList(headA);
        ListNode rHeadB = reverseList(headB);
        if (rHeadA.next == null || rHeadB.next == null) {
            if (rHeadA.val == rHeadB.val) {
                return rHeadB;
            }
        }
        while (true) {
            if (rHeadA.next == null || rHeadB.next == null) {
                return null;
            }

            if (rHeadA.val == rHeadB.val && rHeadA.next.val != rHeadB.next.val) {
                return rHeadA;
            }
            rHeadA = rHeadA.next;
            rHeadB = rHeadB.next;
        }
    }

    private ListNode reverseList(ListNode current) {
        ListNode newHead = new ListNode(current.val);
        while (current.next != null) {
            ListNode tmp = new ListNode(current.next.val);
            tmp.next = newHead;
            newHead = tmp;
            current = current.next;
        }

        return newHead;
    }
}
