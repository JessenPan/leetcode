package org.jessenpan.leetcode.linkedlist;

import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S143ReorderList.*;

/**
 * @author jessenpan
 */
public class S143ReorderListTest {

    private S143ReorderList reorderList = new S143ReorderList();

    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        reorderList.reorderList(head);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        reorderList.reorderList(head);
    }

}
