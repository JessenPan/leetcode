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

        if (nums.length < 3) {
            return false;
        }
        Map<Integer, Item> cntMap = new HashMap<>();
        PriorityQueue<Item> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.num));

        for (int num : nums) {
            cntMap.putIfAbsent(num, new Item(num));
            cntMap.get(num).times++;
        }
        for (Item item : cntMap.values()) {
            queue.offer(item);
        }
        int mod = nums.length % 3;
        int firstNum = mod + 3;
        boolean isFirst = true;
        while (!queue.isEmpty()) {

            List<Item> list = new ArrayList<>();
            int len = isFirst ? firstNum : 3;
            Integer lastNum = null;
            for (int i = 0; i < len; i++) {
                Item item = queue.poll();
                if (lastNum == null) {
                    lastNum = item.num;
                } else {
                }
                item.times--;
                if (item.times == 0) {
                    list.add(item);
                }
            }
        }
        return true;
    }

}
