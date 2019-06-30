package org.jessenpan.leetcode.slidingwindow;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author jessenpan
 * tag:slidingwindow
 */
public class S239SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[0];
        }
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Comparator.reverseOrder());

        int len = nums.length;
        int[] maxs = new int[len - k + 1];
        int maxIdx = 0;
        Integer max = null;
        int left = 0, right = 0;
        while (right < k) {
            pQueue.offer(nums[right]);
            if (max == null) {
                max = nums[right];
            } else {
                max = Math.max(max, nums[right]);
            }
            right++;
        }
        maxs[maxIdx++] = max;

        for (int i = right; i < len; i++) {

            pQueue.remove(nums[left]);

            pQueue.offer(nums[i]);
            maxs[maxIdx++] = pQueue.peek();
            left++;
        }

        return maxs;

    }

}
