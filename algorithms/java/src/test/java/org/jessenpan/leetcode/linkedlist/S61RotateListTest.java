package org.jessenpan.leetcode.linkedlist;

import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S61RotateList.*;

/**
 * @author jessenpan
 */
public class S61RotateListTest {

    private S61RotateList rotateList = new S61RotateList();

    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode newHead = rotateList.rotateRight(head, 2);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(0, new ListNode(1, new ListNode(2)));
        ListNode newHead = rotateList.rotateRight(head, 4);
    }

}
