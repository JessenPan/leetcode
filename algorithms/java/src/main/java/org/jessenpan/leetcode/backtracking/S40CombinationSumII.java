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
        findCombination(0, 0, new ArrayList<Integer>());
        return list;
    }

    private Set<String> record = new HashSet<>();

    private void findCombination(int index, int currentSum, List<Integer> curList) {

        if (currentSum == target) {
            Collections.sort(curList);
            StringBuilder sb = new StringBuilder();

            curList.forEach(t -> {
                sb.append(t).append('_');
            });
            String key = sb.toString();
            if (!record.contains(key)) {
                record.add(key);
                list.add(new ArrayList<>(curList));
            }

            return;
        } else if (currentSum > target || index == candidates.length) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            int newSum = currentSum + candidates[i];
            if (newSum <= target) {
                List<Integer> newSubList = new ArrayList<>(curList);
                newSubList.add(candidates[i]);
                findCombination(i + 1, newSum, newSubList);
            }
        }
    }

}
