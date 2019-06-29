package org.jessenpan.leetcode.heap;

import java.util.PriorityQueue;

/**
 * @author jessenpan
 * tag:heap
 */
public class S215KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        for (int num : nums) {
            pQueue.offer(num);
        }

        while (pQueue.size() > k) {
            pQueue.poll();
        }
        return pQueue.peek();

    }

}
