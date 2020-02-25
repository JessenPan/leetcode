package org.jessenpan.leetcode.math;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author jessenpan
 * tag:math
 */
public class S970PowerfulIntegers {

    //TODO study
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> seen = new HashSet<>();
        boolean isX = false;
        for (int i = 0; Math.pow(x, i) <= bound && !isX; ++i) {
            boolean isY = false;
            for (int j = 0; Math.pow(y, j) <= bound && !isY; ++j) {
                int v = (int) Math.pow(x, i) + (int) Math.pow(y, j);
                if (v <= bound) {
                    seen.add(v);
                }
                if (y == 1) {
                    isY = true;
                }
            }
            if (x == 1) {
                isX = true;
            }
        }

        return new ArrayList<>(seen);
    }
}
