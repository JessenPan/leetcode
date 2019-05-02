package org.jessenpan.leetcode.binarysearch;

/**
 * @author jessenpan
 * tag:binarySearch
 */
public class S374GuessNumberHigherOrLower {

    public int guessNumber(int n) {
        long l = 0;
        long r = n;
        long mid = 0;
        if (guess(n) == 0) {
            return n;
        }
        while (l < r) {
            //be careful of overflow
            mid = (r + l) / 2;
            if (guess((int) mid) == -1) {
                r = mid - 1;
            } else if (guess((int) mid) == 1) {
                l = mid + 1;
            } else {
                return (int) mid;
            }
        }
        return (int) l;
    }

    private int guess(int n) {
        return 0;
    }
}
