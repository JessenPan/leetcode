package org.jessenpan.leetcode.backtracking;

/**
 * @author jessenpan
 * tag:baacktracing
 */
public class S780ReachingPoints {

    //TODO study
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx >= sx && ty >= sy) {
            if (tx == ty) {
                break;
            }
            if (tx > ty) {
                if (ty > sy) {
                    tx %= ty;
                } else {
                    return (tx - sx) % ty == 0;
                }
            } else {
                if (tx > sx) {
                    ty %= tx;
                } else {
                    return (ty - sy) % tx == 0;
                }
            }
        }
        return (tx == sx && ty == sy);

    }

}
