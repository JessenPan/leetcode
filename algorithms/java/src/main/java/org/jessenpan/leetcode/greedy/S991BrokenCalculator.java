package org.jessenpan.leetcode.greedy;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S991BrokenCalculator {

    //TODO 
    public int brokenCalc(int X, int Y) {

        int ans = 0;
        while (Y > X) {
            ans++;
            if ((Y & 1) == 1) {
                //奇数
                Y++;
            } else {
                Y /= 2;
            }
        }

        return ans + X - Y;
    }

}
