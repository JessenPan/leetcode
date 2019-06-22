package org.jessenpan.leetcode.linkedlist;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S328OddEvenLinkedList {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode oddHead = null, oddCurrent = null, evenHead = null, evenCurrent = null;
        ListNode current = head;
        int i = 1;
        while (current != null) {
            if ((i & 1) == 1) {
                //odd
                if (oddHead == null) {
                    oddHead = oddCurrent = current;
                } else {
                    oddCurrent.next = current;
                    oddCurrent = oddCurrent.next;
                }
            } else {
                if (evenHead == null) {
                    evenHead = evenCurrent = current;
                } else {
                    evenCurrent.next = current;
                    evenCurrent = evenCurrent.next;
                }
            }
            i++;
            current = current.next;
        }
        oddCurrent.next = evenHead;
        if (evenCurrent != null) {
            evenCurrent.next = null;
        }
        return oddHead;
    }

}
