package org.jessenpan.leetcode.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S216CombinationSumIII {

    private List<List<Integer>> combinations = new ArrayList<>();

    private int sum;

    private int numCount;

    public List<List<Integer>> combinationSum3(int k, int n) {

        this.sum = n;
        this.numCount = k;
        findCombination(0, new HashSet<Integer>(), 0, 0);
        return combinations;
    }

    private void findCombination(int last, Set<Integer> sets, int currentSum, int index) {
        if (index == numCount) {
            if (currentSum == sum) {
                combinations.add(new ArrayList<>(sets));
            }
            return;
        }

        index++;
        for (int i = last + 1; i <= 9; i++) {
            if (!sets.contains(i) && (currentSum + i) <= sum) {
                sets.add(i);
                findCombination(i, sets, currentSum + i, index);
                sets.remove(i);
            }
        }
    }

}
