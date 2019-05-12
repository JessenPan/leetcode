package org.jessenpan.leetcode.backtracking;

import java.util.*;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S39CombinationSum {

    private List<List<Integer>> combinations = new ArrayList<>();

    private int target;

    private int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target = target;
        this.candidates = candidates;
        findSum(0, new ArrayList<>());
        return combinations;
    }

    private Set<List<Integer>> record = new HashSet<>();

    private void findSum(int currentSum, List<Integer> subList) {
        if (currentSum == target) {
            Collections.sort(subList);
            if (!record.contains(subList)) {
                combinations.add(subList);
                record.add(subList);
            }
            return;
        } else if (currentSum > target) {
            return;
        }

        for (int i = 0; i < candidates.length && candidates[i] <= target; i++) {

            List<Integer> newSubLists = new ArrayList<>(subList);
            newSubLists.add(candidates[i]);
            findSum(currentSum + candidates[i], newSubLists);
        }
    }

}
