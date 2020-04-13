package org.jessenpan.leetcode.math;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:math
 */
public class S957PrisonCellsAfterNDays {

    //TODO
    public int[] prisonAfterNDays(int[] cells, int N) {
        Map<Integer, Integer> seen = new HashMap<>();

        int state = 0;
        for (int i = 0; i < 8; ++i) {
            if (cells[i] > 0) {
                state ^= 1 << i;
            }
        }

        while (N > 0) {
            if (seen.containsKey(state)) {
                N %= seen.get(state) - N;
            }
            seen.put(state, N);

            if (N >= 1) {
                N--;
                state = nextDay(state);
            }
        }

        int[] ans = new int[8];
        for (int i = 0; i < 8; ++i) {
            if (((state >> i) & 1) > 0) {
                ans[i] = 1;
            }
        }

        return ans;
    }

    public int nextDay(int state) {
        int ans = 0;

        for (int i = 1; i <= 6; ++i) {
            if (((state >> (i - 1)) & 1) == ((state >> (i + 1)) & 1)) {
                ans ^= 1 << i;
            }
        }

        return ans;
    }

}
