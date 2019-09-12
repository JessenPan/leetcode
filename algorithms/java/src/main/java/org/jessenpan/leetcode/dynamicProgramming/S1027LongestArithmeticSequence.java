package org.jessenpan.leetcode.dynamicProgramming;

import java.util.*;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S1027LongestArithmeticSequence {

    //TODO 查表
    public int longestArithSeqLength(int[] a) {

        int len = a.length;
        if (len == 0) {
            return 0;
        }
        Map[] dp = new HashMap[len];
        int ret = 1;
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < i; ++j) {
                int gap = a[i] - a[j];
                if (dp[j] == null) {
                    dp[j] = new HashMap();
                }
                if(dp[i]==null){
                    dp[i] = new HashMap();
                }
                if (dp[j].get(gap) != null) {
                    dp[i].put(gap, (Integer) dp[j].getOrDefault(gap, 0) + 1);
                } else {
                    dp[i].put(gap, 2);
                }
                ret = Math.max((Integer) dp[i].get(gap), ret);
            }
        }

        return ret;

    }

}
