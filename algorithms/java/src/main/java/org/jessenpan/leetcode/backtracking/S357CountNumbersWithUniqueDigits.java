package org.jessenpan.leetcode.backtracking;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S357CountNumbersWithUniqueDigits {

    private int numOfUnique = 0;

    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        findSameNum(new HashSet<Integer>(), 0, n);
        return numOfUnique;
    }

    private void findSameNum(Set<Integer> sets, int index, int n) {
        if (index == n) {
            numOfUnique++;
            return;
        }
        index++;
        for (int i = 0; i <= 9; i++) {
            if (sets.isEmpty() && i == 0) {
                findSameNum(sets, index, n);
            } else if (!sets.contains(i)) {
                sets.add(i);
                findSameNum(sets, index, n);
                sets.remove(i);
            }
        }
    }

}
