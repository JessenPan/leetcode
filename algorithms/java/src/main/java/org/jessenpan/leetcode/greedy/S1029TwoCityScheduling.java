package org.jessenpan.leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S1029TwoCityScheduling {

    public int twoCitySchedCost(int[][] costs) {

        Arrays.sort(costs, Comparator.comparingInt(o -> o[0] - o[1]));

        int total = 0;
        int n = costs.length / 2;
        for (int i = 0; i < n; ++i) {
            total += costs[i][0] + costs[i + n][1];
        }
        return total;
    }

}
