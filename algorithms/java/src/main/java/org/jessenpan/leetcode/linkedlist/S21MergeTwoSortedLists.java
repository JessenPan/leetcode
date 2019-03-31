package org.jessenpan.leetcode.linkedlist;

/**
 * @author jessenpan
 * tag:linked list
 */
public class S21MergeTwoSortedLists {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode mergedList, originList, beComparedList;
        if (l1.val <= l2.val) {
            mergedList = originList = l1;
            beComparedList = l2;
        } else {
            mergedList = originList = l2;
            beComparedList = l1;
        }
        while (beComparedList != null) {
            if (originList.next == null) {
                originList.next = new ListNode(beComparedList.val);
                beComparedList = beComparedList.next;
                originList = originList.next;
            } else if (beComparedList.val < originList.next.val) {

                ListNode lastNext = originList.next;
                originList.next = new ListNode(beComparedList.val);
                beComparedList = beComparedList.next;
                originList = originList.next;
                originList.next = lastNext;
            } else {
                originList = originList.next;
            }
        }
        return mergedList;
    }
}
