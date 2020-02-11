package org.jessenpan.leetcode.heap;

import java.util.*;

/**
 * @author jessenpan
 * tag:heap
 */
public class S659SplitArrayIntoConsecutiveSubsequences {

    static class Item {

        Item(int num) {
            this.num = num;
        }

        int num, times = 0;
    }

    public boolean isPossible(int[] nums) {

        int len = nums.length, currentLeaved = nums.length;
        if (len < 3) {
            return false;
        }
        Map<Integer, Item> cntMap = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(len);
        for (int num : nums) {
            cntMap.putIfAbsent(num, new Item(num));
            cntMap.get(num).times++;
        }
        PriorityQueue<Integer> next = new PriorityQueue<>();
        Integer last = null;
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            Integer nextVal = queue.poll();
            if (last == null) {
                last = nextVal;
                list.add(nextVal);
            } else {
                if (nextVal.equals(last)) {
                    next.add(nextVal);
                } else if (nextVal - last == 1) {
                    list.add(nextVal);
                    last = nextVal;
                } else {
                    if (list.size() < 3) {
                        return false;
                    } else {
                        queue.addAll(next);
                        next.clear();
                        last = null;
                        list.clear();
                    }
                }
            }
            if (queue.isEmpty() && (!next.isEmpty() || !list.isEmpty())) {
                if (list.size() < 3) {
                    return false;
                }
                queue.addAll(next);
                next.clear();
                list.clear();
                last = null;
            }
        }
        return true;
    }

}
