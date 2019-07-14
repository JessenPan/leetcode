package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:
 */
public class S1014BestSightseeingPair {

    public int maxScoreSightseeingPair(int[] a) {
        int len = a.length;
        int[] lefts = new int[len], rights = new int[len];
        //TODO 前连个for 可以合并
        for (int i = 0; i < len; i++) {
            lefts[i] = a[i] + i;
            rights[i] = a[i] - i;
        }

        for (int i = len - 1; i >= 0; i--) {
            if (i == (len - 1)) {
                continue;
            }
            rights[i] = Math.max(rights[i], rights[i + 1]);
        }
        int max=0;
        for (int i = 0; i < len; i++) {
            if (i == (len - 1)) {
                continue;
            }
            max = Math.max(max, lefts[i] + rights[i + 1]);
        }
        return max;
    }

}
