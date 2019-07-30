package org.jessenpan.leetcode.recursion;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:recursion
 */
public class S1137NthTribonacciNumber {

    private Map<Integer, Integer> record = new HashMap<>();

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int val = 0;
        for (int i = 3; i >= 1; i--) {
            if (record.get(n - i) != null) {
                val += record.get(n - i);
            } else {
                int tmp = tribonacci(n - i);
                record.put(n - i, tmp);
                val += tmp;
            }
        }

        return val;

    }

}
