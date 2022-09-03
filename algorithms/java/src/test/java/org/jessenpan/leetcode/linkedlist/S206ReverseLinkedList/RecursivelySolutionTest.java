package org.jessenpan.leetcode.linkedlist.S206ReverseLinkedList;

import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S206ReverseLinkedList.RecursivelySolution.*;

/**
 * @author jessenpan
 */
public class RecursivelySolutionTest {

    @Test
    public void test() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;

        RecursivelySolution solution = new RecursivelySolution();
        ListNode tHead = solution.reverseList(first);

        //直接比较地址
        Assert.assertTrue(tHead == fourth);
        Assert.assertTrue(tHead.next == third);
        Assert.assertTrue(tHead.next.next == second);
        Assert.assertTrue(tHead.next.next.next == first);

    }

}
