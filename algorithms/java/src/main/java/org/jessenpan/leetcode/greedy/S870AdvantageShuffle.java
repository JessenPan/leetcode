package org.jessenpan.leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S870AdvantageShuffle {

    public int[] advantageCount(int[] A, int[] B) {

        Element[] elements = new Element[B.length];
        int len = B.length;
        for (int i = 0; i < len; i++) {
            elements[i] = new Element(B[i], i);
        }
        Arrays.sort(elements, Comparator.comparingInt(o -> o.val));
        Arrays.sort(A);
        int[] rst = new int[len];
        int j = 0, i = 0;
        for (; i < len; i++) {
            if (j < len && elements[i].val < A[j]) {
                rst[elements[i].pos] = A[j];
                A[j] = -1;
                j++;
            } else {
                while (j < len && elements[i].val >= A[j]) {
                    j++;
                }
                if (j >= len) {
                    break;
                } else {
                    rst[elements[i].pos] = A[j];
                    A[j] = -1;
                    j++;
                }
            }
        }
        j = 0;
        while (i < len) {

            while (A[j] == -1) {
                j++;
            }
            rst[elements[i].pos] = A[j];
            j++;
            i++;
        }
        return rst;
    }

    static class Element {

        int val;
        int pos;

        public Element(int val, int pos) {
            this.val = val;
            this.pos = pos;
        }
    }

}
