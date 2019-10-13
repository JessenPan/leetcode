package org.jessenpan.leetcode.array;

import java.util.*;

/**
 * @author jessenpan
 * tag:array
 */
public class S18FourSum {

    private List<List<Integer>> rs;

    private int[] nums;

    private int target;

    private Set<String> record = new HashSet<>();

    public List<List<Integer>> fourSum(int[] nums, int target) {

        if (nums.length < 4) {
            return Collections.emptyList();
        }
        rs = new ArrayList<>();
        this.target = target;
        this.nums = nums;
        Arrays.sort(nums);
        find(new ArrayList<Integer>(), null, 0);
        return rs;
    }

    private void find(List<Integer> tmpRsList, Integer currentSum, int currentIndex) {
        if (tmpRsList.size() == 4) {
            if (sum(tmpRsList) == target) {
                String strKey = buildKey(tmpRsList);
                if (record.add(strKey)) {
                    rs.add(tmpRsList);
                }
            }
            return;
        }

        if (currentIndex >= nums.length) {
            return;
        }

        if (currentSum != null && currentSum > target) {
            return;
        }

        find(new ArrayList<>(tmpRsList), currentSum, currentIndex + 1);
        List<Integer> newList = new ArrayList<>(tmpRsList);
        newList.add(this.nums[currentIndex]);
        currentSum = (currentSum == null ? 0 : currentSum) + this.nums[currentIndex];
        find(newList, currentSum, currentIndex + 1);
    }

    private String buildKey(List<Integer> tmpRsList) {
        StringBuilder key = new StringBuilder();
        for (Integer integer : tmpRsList) {
            key.append(integer).append("_");
        }
        return key.toString();
    }

    private int sum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }

}
