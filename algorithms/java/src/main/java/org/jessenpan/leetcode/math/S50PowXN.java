package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 */
public class S50PowXN {

    public double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }
        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            n = -n;
        }
        double d = x;
        for (int i = 1; i < n; i++) {
            d *= x;
        }
        if (isNegative) {
            d = 1 / d;
        }
        return d;
    }

}
