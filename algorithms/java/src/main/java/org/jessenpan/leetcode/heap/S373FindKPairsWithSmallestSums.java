package org.jessenpan.leetcode.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author jessenpan
 * tag:heap
 */
public class S373FindKPairsWithSmallestSums {

    static class SortSum {

        int sum;

        List<Integer> pair = new ArrayList<>();

        SortSum(int aOfPair, int bOfPair) {
            this.sum = aOfPair + bOfPair;
            this.pair.add(aOfPair);
            this.pair.add(bOfPair);
        }
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<SortSum> pQueue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.sum, o1.sum));

        for (int numOfNums1 : nums1) {
            for (int numOfNums2 : nums2) {

                pQueue.offer(new SortSum(numOfNums1, numOfNums2));
                while (pQueue.size() > k) {
                    pQueue.poll();
                }
            }
        }

        List<List<Integer>> kParis = new ArrayList<>(pQueue.size());
        while (!pQueue.isEmpty()) {
            kParis.add(pQueue.poll().pair);
        }
        return kParis;
    }

}
