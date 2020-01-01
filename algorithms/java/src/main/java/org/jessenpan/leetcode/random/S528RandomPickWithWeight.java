package org.jessenpan.leetcode.random;

import java.util.Random;

/**
 * @author jessenpan
 * tag:random
 */
public class S528RandomPickWithWeight {

    public static class Solution {

        private Random random = new Random();

        private int bound;

        private int[] array;

        public Solution(int[] w) {
            int len = w.length;
            array = new int[len];
            for (int i = 0; i < len; i++) {
                bound += w[i];
                if (i == 0) {
                    array[i] = w[i] - 1;
                    continue;
                }
                array[i] = array[i - 1] + w[i];
            }
        }

        public int pickIndex() {
            if (array.length == 1) {
                return 0;
            }
            int randomVal = random.nextInt(bound);
            int left = 0, right = array.length - 1, mid;
            if (randomVal <= array[left]) {
                return left;
            }
            if (randomVal > array[right - 1]) {
                return right;
            }
            while (left <= right) {
                mid = (left + right) / 2;
                if (mid != 0) {
                    if (randomVal > array[mid - 1] && randomVal <= array[mid]) {
                        return mid;
                    }
                }
                if (randomVal < array[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }
    }

}
