package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:linked list
 */
public class S203RemoveLinkedListElements {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }
        ListNode(int x,ListNode next){
            this.val=x;
            this.next=next;
        } 
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode current = head;
        while (current != null) {
            if (current.next != null && current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
