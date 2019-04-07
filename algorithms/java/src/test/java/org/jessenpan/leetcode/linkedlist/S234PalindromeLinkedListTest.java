package org.jessenpan.leetcode.linkedlist;

import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S234PalindromeLinkedList.ListNode;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S234PalindromeLinkedListTest {

    private S234PalindromeLinkedList palindromeLinkedList = new S234PalindromeLinkedList();

    @Test
    public void test1() {
        boolean isPalindrome = palindromeLinkedList.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1)))));
        assertTrue(isPalindrome);
    }

    @Test
    public void test2() {
        boolean isPalindrome = palindromeLinkedList.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1))))));
        assertTrue(isPalindrome);
    }

    @Test
    public void test3() {
        boolean isPalindrome = palindromeLinkedList.isPalindrome(new ListNode(1, new ListNode(2)));
        assertFalse(isPalindrome);
    }

}
