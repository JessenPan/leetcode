package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S441ArrangingCoins {

    public int arrangeCoins(int n) {
        return (int) ((-1 + Math.sqrt(1 + 8L * n)) / 2);
    }

}
