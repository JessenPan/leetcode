package org.jessenpan.leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S142LinkedListCycleII {

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

    public ListNode detectCycle(ListNode head) {

        Set<ListNode> record = new HashSet<>();

        ListNode theCycleNode = null;

        while (head != null) {
            if (record.contains(head)) {
                theCycleNode = head;
                break;
            }
            record.add(head);
            head = head.next;
        }
        if (theCycleNode != null) {
            theCycleNode.next = null;
        }
        return theCycleNode;

    }

}
