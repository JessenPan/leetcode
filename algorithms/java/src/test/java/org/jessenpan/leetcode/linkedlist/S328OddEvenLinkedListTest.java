package org.jessenpan.leetcode.linkedlist;

import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S328OddEvenLinkedList.*;

/**
 * @author jessenpan
 */
public class S328OddEvenLinkedListTest {

    private S328OddEvenLinkedList oddEvenLinkedList = new S328OddEvenLinkedList();

    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode newHead = oddEvenLinkedList.oddEvenList(head);
    }


    @Test
    public void test2() {
        ListNode head = new ListNode(1,new ListNode(2));
        ListNode newHead = oddEvenLinkedList.oddEvenList(head);
    }

}
