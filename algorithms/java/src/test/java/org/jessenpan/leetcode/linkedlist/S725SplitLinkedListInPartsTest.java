package org.jessenpan.leetcode.linkedlist;

import org.jessenpan.leetcode.linkedlist.S725SplitLinkedListInParts.ListNode;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S725SplitLinkedListInPartsTest {

    private S725SplitLinkedListInParts splitLinkedListInParts = new S725SplitLinkedListInParts();

    @Test
    public void test1() {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode[] splits = splitLinkedListInParts.splitListToParts(head, 5);
    }

    @Test
    public void test2() {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(9, new ListNode(10))))))))));
        ListNode[] splits = splitLinkedListInParts.splitListToParts(head, 3);
    }

    @Test
    public void test3() {

        ListNode head = new ListNode(0, new ListNode(1, new ListNode(2)));
        ListNode[] splits = splitLinkedListInParts.splitListToParts(head, 2);
    }

}
