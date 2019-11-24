package org.jessenpan.leetcode.sample;

import static org.jessenpan.leetcode.sample.S382LinkedListRandomNode.*;

/**
 * @author jessenpan
 */
public class S382LinkedListRandomNodeTest {

    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        Solution solution = new Solution(head);
        int t = solution.getRandom();
    }

}
