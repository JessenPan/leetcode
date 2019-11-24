package org.jessenpan.leetcode.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author jessenpan
 * tag:sample
 */
public class S382LinkedListRandomNode {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public static class Solution {

        private Random random = new Random();

        private int bound;

        private Map<Integer, ListNode> record = new HashMap<>();

        public Solution(ListNode head) {
            int i = 0;
            while (head != null) {
                record.put(i, head);
                head = head.next;
                i++;
            }
            bound = i;
        }

        public int getRandom() {
            return record.get(random.nextInt(bound)).val;
        }
    }

}
