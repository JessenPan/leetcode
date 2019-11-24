package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S789EscapeTheGhosts {

    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int distance = Math.abs(target[1]) + Math.abs(target[0]);
        for (int[] ghost : ghosts) {
            boolean isLess = Math.abs(target[1] - ghost[1]) + Math.abs(target[0] - ghost[0]) <= distance;
            if (isLess) {
                return false;
            }
        }
        return true;
    }

}
