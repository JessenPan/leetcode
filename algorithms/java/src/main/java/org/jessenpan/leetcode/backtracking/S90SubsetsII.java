package org.jessenpan.leetcode.backtracking;

import java.util.*;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S90SubsetsII {

    private List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        findSubsets(nums, 0, new ArrayList<>());
        return lists;
    }

    private Set<List<Integer>> record = new HashSet<>();

    private void findSubsets(int[] nums, int index, List<Integer> subList) {
        if (index == nums.length) {
            Collections.sort(subList);
            if (!record.contains(subList)) {
                lists.add(subList);
                record.add(subList);
            }
                
            return;
        }

        List<Integer> listHavingIndex = new ArrayList<>(subList);
        listHavingIndex.add(nums[index]);
        findSubsets(nums, index + 1, listHavingIndex);

        findSubsets(nums, index + 1, new ArrayList<>(subList));
    }

}
