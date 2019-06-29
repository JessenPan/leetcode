package org.jessenpan.leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author jessenpan
 */
public class S378KthSmallestElementInASortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {

        int row = matrix.length, col = matrix[0].length;

        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                pQueue.add(matrix[i][j]);

                while (pQueue.size() > k) {
                    pQueue.poll();
                }
            }
        }
        return pQueue.peek();
    }

}
