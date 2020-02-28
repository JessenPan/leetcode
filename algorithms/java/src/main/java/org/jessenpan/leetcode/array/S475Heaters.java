package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author jessenpan
 * tag:array
 */
public class S475Heaters {

    //TODO study
    public int findRadius(int[] houses, int[] heaters) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(houses);
        Arrays.sort(heaters);
        for (int house : houses) {
            int left = 0, right = heaters.length - 1, mid;
            while (left < right) {
                mid = (left + right) >> 1;
                if (heaters[mid] < house) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            if (heaters[left] == house) {
                res.add(0);
            } else if (heaters[left] < house) {
                res.add(house - heaters[left]);
            } else if (left != 0) {
                res.add(Math.min(heaters[left] - house, house - heaters[left - 1]));
            } else {
                res.add(heaters[left] - house);
            }
        }
        return res.stream().max(Comparator.naturalOrder()).get();
    }

}
