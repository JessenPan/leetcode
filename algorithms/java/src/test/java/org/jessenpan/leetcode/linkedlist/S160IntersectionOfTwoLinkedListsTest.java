package org.jessenpan.leetcode.linkedlist;

import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S160IntersectionOfTwoLinkedLists.ListNode;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S160IntersectionOfTwoLinkedListsTest {

    private S160IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists = new S160IntersectionOfTwoLinkedLists();

    @Test
    public void test1() {
        ListNode node1 = new ListNode(4, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5)))));
        ListNode node2 = new ListNode(5, new ListNode(0, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))));
        ListNode node = intersectionOfTwoLinkedLists.getIntersectionNode(node1, node2);
        assertEquals(8, node.val);
    }

}
