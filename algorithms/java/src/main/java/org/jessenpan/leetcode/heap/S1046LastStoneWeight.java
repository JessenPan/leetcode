package org.jessenpan.leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author jessenpan
 * tag:heap
 */
public class S1046LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int stone : stones) {
            pQueue.offer(stone);
        }

        int left = 0;
        while (pQueue.size() >= 2) {
            left = Math.abs(pQueue.poll() - pQueue.poll());
            if (left > 0) {
                pQueue.offer(left);
            }
        }

        return pQueue.size() == 1 ? pQueue.poll() : 0;
    }

}
