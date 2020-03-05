package org.jessenpan.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:array
 */
public class S822CardFlippingGame {

    public int flipgame(int[] fronts, int[] backs) {
        Set<Integer> same = new HashSet<>();
        for (int i = 0; i < fronts.length; ++i) {
            if (fronts[i] == backs[i]) {
                same.add(fronts[i]);
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int x : fronts) {
            if (!same.contains(x)) {
                ans = Math.min(ans, x);
            }
        }

        for (int x : backs) {
            if (!same.contains(x)) {
                ans = Math.min(ans, x);
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
