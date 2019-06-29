package org.jessenpan.leetcode.heap;

import java.util.PriorityQueue;

/**
 * @author jessenpan
 * tag:heap
 */
public class S703KthLargestElementInAStream {

    public static class KthLargest {

        private int k;

        private PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        public KthLargest(int k, int[] nums) {
            this.k = k;
            for (int num : nums) {
                pQueue.add(num);
            }

            while (pQueue.size() > k) {
                pQueue.poll();
            }
        }

        public int add(int val) {
            pQueue.add(val);
            if (pQueue.size() == k) {
                return pQueue.peek();
            }
            pQueue.poll();
            return pQueue.peek();
        }
    }

}
