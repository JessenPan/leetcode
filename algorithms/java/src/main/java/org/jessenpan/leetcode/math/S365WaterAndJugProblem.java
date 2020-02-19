package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S365WaterAndJugProblem {

    public boolean canMeasureWater(int x, int y, int z) {
        if (z == 0) {
        return true;
    }
        if (x == 0 && y == 0) {
        return false;
    }
        if (x + y < z) {
        return false;
    }
        if (x != 0 && y != 0 && x != y) {
        int remain;
        while (true) {
            if (x > y) {
                remain = x % y;
                if (remain != 0) {
                    x = remain;
                } else {
                    break;
                }
            } else {
                remain = y % x;
                if (remain != 0) {
                    y = remain;
                } else {
                    break;
                }
            }
        }
    }

    int diff;
        if (x > y) {
        diff = x - y;
    } else {
        diff = y - x;
    }

        if (diff == 0) {
        return calc(x, y, z);
    }

        return calc(x, y, diff, z);
}

    private boolean calc(int x, int y, int diff, int target) {
        int xBound = (x == 0 ? 1 : target / x + 1);
        int yBound = (y == 0 ? 1 : target / y + 1);
        for (int i = 0; i <= xBound; i++) {
            for (int j = 0; j <= yBound; j++) {
                int remain = target - i * x - j * y;
                if (remain < 0) {
                    continue;
                }
                if (remain % diff == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean calc(int x, int y, int target) {
        for (int i = 0; ; i++) {
            int remain = target - i * x;
            if (remain < 0) {
                return false;
            }
            if (remain != 0 && y == 0) {
                return false;
            }
            if (remain % y == 0) {
                return true;
            }
        }
    }
}
