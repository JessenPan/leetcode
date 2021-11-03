package org.jessenpan.leetcode.map;

import java.util.HashMap;

/**
 * @author jessenpan
 * tag:map
 */
public class S982TriplesWithBitwiseAndEqualToZero {

    public int countTriplets(int[] A) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0, N = A.length;

        for (int value : A) {
            for (int i : A) {
                int temp = value & i;
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        for (int key : map.keySet()) {
            // 一个优化，当key = 0时，数组中任何值与其&运算结果均为0
            if (key == 0) {
                ans += map.get(key) * N;
                continue;
            }
            for (int i = 0; i < N; i++) {
                if ((A[i] & key) == 0) {
                    ans += map.get(key);
                }
            }
        }

        return ans;
    }

}
