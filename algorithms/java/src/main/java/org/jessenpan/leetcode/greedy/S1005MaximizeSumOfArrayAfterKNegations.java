package org.jessenpan.leetcode.greedy;

import java.util.PriorityQueue;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S1005MaximizeSumOfArrayAfterKNegations {

    public int largestSumAfterKNegations(int[] a, int k) {

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        int len = a.length;
        for (int i = 0; i < len; i++) {
            pQueue.offer(a[i]);
        }
        int i = 0;
        while (i < k) {
            Integer it = pQueue.poll();
            pQueue.offer(-it);
            i++;
        }
        int sum = 0;
        while (!pQueue.isEmpty()) {
            sum += pQueue.poll();
        }
        return sum;
    }

}
