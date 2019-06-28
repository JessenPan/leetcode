package org.jessenpan.leetcode.heap;

import java.util.Iterator;
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
                pQueue.offer(num);
            }
        }

        public int add(int val) {
            pQueue.offer(val);
            Iterator<Integer> iterator = pQueue.iterator();
            int i = 0;
            while (i <= k) {
                i++;
                System.out.println(iterator.next());
            }
            return iterator.next();
        }
    }

}
