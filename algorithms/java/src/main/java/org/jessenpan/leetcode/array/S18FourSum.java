package org.jessenpan.leetcode.array;

import java.util.*;

/**
 * @author jessenpan
 * tag:array
 */
public class S18FourSum {

    private List<List<Integer>> rs = new ArrayList<>();

    private int[] nums;

    private Integer target;

    private Set<String> record = new HashSet<>();

    public List<List<Integer>> fourSum(int[] nums, int target) {

        if (nums.length < 4) {
            return Collections.emptyList();
        }
        if (nums.length == 4) {
            if (Arrays.stream(nums).sum() == target) {
                List<Integer> list = new ArrayList<>();
                Arrays.stream(nums).forEach(list::add);
                return Collections.singletonList(list);
            } else {
                return Collections.emptyList();
            }
        }

        this.target = target;
        this.nums = nums;
        Arrays.sort(nums);
        if(target<nums[0]){
            return Collections.emptyList();
        }
        find(new ArrayList<>(), null, 0);
        return rs;
    }

    private void find(List<Integer> tmpRsList, Integer currentSum, int currentIndex) {
        if (tmpRsList.size() == 4) {
            if (target.equals(currentSum)) {
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

        if (currentSum != null) {
            if (currentSum > 0 && currentSum > target) {
                return;
            }
        }

        for (int i = currentIndex; i < nums.length; i++) {
            List<Integer> newList = new ArrayList<>(tmpRsList);
            newList.add(nums[i]);
            find(newList, currentSum == null ? nums[i] : currentSum + nums[i], i + 1);
        }
    }

    private String buildKey(List<Integer> tmpRsList) {
        StringBuilder key = new StringBuilder();
        for (Integer integer : tmpRsList) {
            key.append(integer).append("_");
        }
        return key.toString();
    }

}
