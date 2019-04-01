package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S263UglyNumber {

    private static final int[] FACTORS = new int[] { 2, 3, 5 };

    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        Match match = isMatch(num);
        while (match.isMatch) {
            num = num / match.factor;
            if (num == 1) {
                return true;
            }
            match = isMatch(num);
        }
        return false;
    }

    private Match isMatch(int num) {
        Match match = new Match();
        for (int factor : FACTORS) {
            if (num % factor == 0) {
                match.isMatch = true;
                match.factor = factor;
            }
        }
        return match;
    }

    private static class Match {

        boolean isMatch = false;

        int factor;
    }
}
