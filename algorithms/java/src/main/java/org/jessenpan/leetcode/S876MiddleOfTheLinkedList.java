package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:linked list
 */
public class S876MiddleOfTheLinkedList {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }

    public ListNode middleNode(ListNode head) {

        if (head == null) {
            return null;
        }
        int lengthOfList = 0;
        ListNode current = head;
        while (current != null) {
            lengthOfList++;
            current = current.next;
        }
        //(lengthOfList % 2 == 0 ? (lengthOfList / 2 + 1) : lengthOfList / 2)
        int targetPosition = lengthOfList / 2;
        ListNode targetHead = head;
        int i = 0;
        while (i < targetPosition) {
            targetHead = targetHead.next;
            i++;
        }
        return targetHead;
    }
}
