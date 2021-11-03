package org.jessenpan.leetcode.binarysearch;

/**
 * @author jessenpan
 * tag:binarysearch
 */
public class S875KokoEatingBananas {

    private int[] piles;

    public int minEatingSpeed(int[] piles, int H) {
        this.piles = piles;
        int len = piles.length;
        int left = 1;
        int right = 1_000_000_000;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (!canEat(H, mid)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public boolean canEat(int times, int num) {
        int time = 0;
        for (int p : piles) {
            time += (p - 1) / num + 1;
        }
        return time <= times;
    }
}
