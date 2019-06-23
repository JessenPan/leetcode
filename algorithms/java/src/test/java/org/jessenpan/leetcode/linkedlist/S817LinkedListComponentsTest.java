package org.jessenpan.leetcode.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S817LinkedListComponents.*;

/**
 * @author jessenpan
 */
public class S817LinkedListComponentsTest {

    private S817LinkedListComponents linkedListComponents = new S817LinkedListComponents();

    @Test
    public void test1() {
        ListNode head = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3))));
        int num = linkedListComponents.numComponents(head, new int[] { 0, 1, 3 });
        Assert.assertEquals(2, num);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        int num = linkedListComponents.numComponents(head, new int[] { 0, 1, 3, 4 });
        Assert.assertEquals(2, num);
    }

}
