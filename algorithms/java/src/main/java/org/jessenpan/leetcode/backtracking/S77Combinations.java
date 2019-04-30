package org.jessenpan.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S77Combinations {

    private int k;

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        this.k = k;
        findCombination(combinations, 1, new ArrayList<Integer>(), n);
        return combinations;
    }

    private void findCombination(List<List<Integer>> combinations, int index, List<Integer> combination, int n) {
        if (combination.size() == k) {
            combinations.add(combination);
            return;
        }

        for (int i = index; i <= n; i++) {
            List<Integer> newCombination = new ArrayList<>(combination);
            newCombination.add(i);
            findCombination(combinations, i + 1, newCombination, n);
        }

    }

}
