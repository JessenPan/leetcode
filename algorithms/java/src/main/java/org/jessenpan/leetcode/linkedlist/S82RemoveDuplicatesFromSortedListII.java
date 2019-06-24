package org.jessenpan.leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S82RemoveDuplicatesFromSortedListII {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> record = new HashSet<>();
        ListNode newHead = new ListNode(0);
        ListNode current = newHead;

        while (head != null) {
            ListNode next = head.next;
            if (!record.contains(head.val) && next == null) {
                record.add(head.val);
                current.next = head;
                current = current.next;
            } else if (next != null && !record.contains(head.val) && head.val != next.val) {
                record.add(head.val);
                current.next = head;
                current = current.next;
            } else {
                record.add(head.val);
            }
            head = head.next;
        }
        current.next = null;

        return newHead.next;
    }

}
