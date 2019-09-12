package org.jessenpan.leetcode.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:dynamicprogrmming
 */
public class S96UniqueBinarySearchTrees {

    public int numTrees(int n) {

        if (n == 1) {
            return 1;
        }
        Map<Integer, Integer> record = new HashMap<>();
        record.put(1, 1);
        record.put(0, 1);
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += record.get(j - 1) * record.get(i - j);
            }
            record.put(i, sum);
        }
        return record.get(n);
    }

}
