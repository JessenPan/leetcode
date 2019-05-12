package org.jessenpan.leetcode.backtracking;

import java.util.*;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S40CombinationSumII {

    private int[] candidates;

    private int target;

    private List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        this.candidates = candidates;
        this.target = target;
        findCombination(0, 0, new ArrayList<>());
        return list;
    }

    private Set<List<Integer>> record = new HashSet<>();

    private void findCombination(int index, int currentSum, List<Integer> lists) {

        if (currentSum == target) {
            Collections.sort(lists);
            if (!record.contains(lists)) {
                list.add(lists);
                record.add(lists);
            }
            return;
        } else if (currentSum > target || index == candidates.length) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            int newSum = currentSum + candidates[i];
            List<Integer> newList = new ArrayList<>(lists);
            newList.add(candidates[i]);
            swap(index, i);
            findCombination(index + 1, newSum, newList);
            swap(i, index);
        }
    }

    private void swap(int index, int i) {
        int tmp = candidates[index];
        candidates[index] = candidates[i];
        candidates[i] = tmp;
    }

}
