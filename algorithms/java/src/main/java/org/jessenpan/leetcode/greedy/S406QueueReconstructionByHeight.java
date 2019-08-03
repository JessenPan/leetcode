package org.jessenpan.leetcode.greedy;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S406QueueReconstructionByHeight {

    public int[][] reconstructQueue(int[][] people) {

        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? Integer.compare(o1[1], o2[1]) : Integer.compare(o2[0], o1[0]));

        int[][] queues = new int[people.length][2];
        int len = people.length;

        int sizeOfQueue = 0;
        for (int i = 0; i < len; i++) {
            int[] p = people[i];
            int k = p[1];
            for (int j = sizeOfQueue; j > k; j--) {
                queues[j] = queues[j - 1];
            }
            queues[k] = people[i];
            sizeOfQueue++;
        }

        return queues;
    }

}
