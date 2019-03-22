package org.jessenpan.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:math
 */
public class S970PowerfulIntegers {

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int lastResult = 0;
        List<Integer> powerfulIntegers = new ArrayList<>();
        int i;
        for (i = 0; ; i++) {
            int j;
            for (j = 0; ; j++) {
                if (y == 1 && j == 1) {
                    break;
                }
                lastResult = (int) (Math.pow(x, i) + Math.pow(y, j));
                if (lastResult <= bound) {
                    if (!powerfulIntegers.contains(lastResult)) {
                        powerfulIntegers.add(lastResult);
                    }
                } else {
                    break;
                }
            }
            if (j == 0) {
                break;
            }
        }
        return powerfulIntegers;
    }
}
