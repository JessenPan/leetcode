package org.jessenpan.leetcode.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S1019NextGreaterNodeInLinkedList.*;

/**
 * @author jessenpan
 */
public class S1019NextGreaterNodeInLinkedListTest {

    private S1019NextGreaterNodeInLinkedList nextGreaterNodeInLinkedList = new S1019NextGreaterNodeInLinkedList();

    @Test
    public void test1() {
        ListNode head = new ListNode(2, new ListNode(1, new ListNode(5)));
        int[] nextGreaters = nextGreaterNodeInLinkedList.nextLargerNodes(head);
        Assert.assertArrayEquals(new int[] { 5, 5, 0 }, nextGreaters);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(2, new ListNode(7, new ListNode(4, new ListNode(3, new ListNode(5)))));
        int[] nextGreaters = nextGreaterNodeInLinkedList.nextLargerNodes(head);
        Assert.assertArrayEquals(new int[] { 7, 0, 5, 5, 0 }, nextGreaters);
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1, new ListNode(7, new ListNode(5, new ListNode(1, new ListNode(9, new ListNode(2, new ListNode(5, new ListNode(1))))))));
        int[] nextGreaters = nextGreaterNodeInLinkedList.nextLargerNodes(head);
        Assert.assertArrayEquals(new int[] { 7, 9, 9, 9, 0, 5, 0, 0 }, nextGreaters);
    }

}
