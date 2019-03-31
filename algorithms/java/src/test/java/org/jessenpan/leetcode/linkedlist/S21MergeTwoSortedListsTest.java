package org.jessenpan.leetcode.linkedlist;

import org.jessenpan.leetcode.linkedlist.S21MergeTwoSortedLists;
import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S21MergeTwoSortedLists.*;

/**
 * @author jessenpan
 */
public class S21MergeTwoSortedListsTest {

    private S21MergeTwoSortedLists mergeTwoSortedLists = new S21MergeTwoSortedLists();
    
    @Test
    public void test1(){
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        mergeTwoSortedLists.mergeTwoLists(l1, l2);
    }

    @Test
    public void test2(){
        ListNode l1 = new ListNode(-9, new ListNode(3));
        ListNode l2 = new ListNode(5, new ListNode(7));
        mergeTwoSortedLists.mergeTwoLists(l1, l2);
    }
    
}
