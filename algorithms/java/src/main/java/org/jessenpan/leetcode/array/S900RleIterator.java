package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S900RleIterator {

    public static class RLEIterator {

        private int[] arr;

        private int len;

        private int idx = 0;

        public RLEIterator(int[] a) {
            this.arr = a;
            this.len = a.length - 1;
        }

        public int next(int n) {

            while (idx < len && n > arr[idx]) {
                n -= arr[idx];
                idx += 2;
            }

            if (idx >= len) {
                return -1;
            }

            if (n < arr[idx]) {
                arr[idx] -= n;
                return arr[idx+1];
            }

            if (n == arr[idx]) {
                idx += 2;
                return arr[idx - 1];
            }

            return -1;

        }
    }

}
