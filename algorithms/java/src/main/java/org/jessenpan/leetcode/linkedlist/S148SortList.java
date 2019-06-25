package org.jessenpan.leetcode.linkedlist;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S148SortList {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }
    
    //TODO pivot

    public ListNode sortList(ListNode head) {
        quickSort(head, null);
        return head;
    }

    private void quickSort(ListNode head, ListNode tail) {
        if (head == tail || head.next == tail)
            return;
        int pivot = head.val;
        ListNode left = head, cur = head.next;
        while (cur != tail) {
            if (cur.val < pivot) {
                left = left.next;
                swap(left, cur);
            }
            cur = cur.next;
        }
        swap(head, left);
        quickSort(head, left);
        quickSort(left.next, tail);
    }

    private void swap(ListNode left, ListNode right) {
        int tmp = left.val;
        left.val = right.val;
        right.val = tmp;
    }

}
