package org.jessenpan.leetcode.dynamicprogramming;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S646MaximumLengthOfPairChain {

    public int findLongestChain(int[][] pairs) {
        int len = pairs.length;
        if (len <= 1) {
            return len;
        }
        Pair[] pairObjArray = new Pair[len];
        for (int i = 0; i < len; i++) {
            pairObjArray[i] = new Pair(pairs[i][0], pairs[i][1]);
        }
        Arrays.sort(pairObjArray, (o1, o2) -> {
            if (o1.first != o2.first) {
                return Integer.compare(o1.first, o2.first);
            }
            return Integer.compare(o1.second, o2.second);
        });
        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            dp[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (pairObjArray[i].first > pairObjArray[j].second) {
                    dp[i] = dp[j] + 1;
                    break;
                }
            }
        }
        return Arrays.stream(dp).max().orElse(1);
    }

    static class Pair {

        int first, second;

        Pair(int f, int s) {
            this.first = f;
            this.second = s;
        }
    }

}
