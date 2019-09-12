package org.jessenpan.leetcode.dynamicProgramming;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S91DecodeWays {

    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        // 考虑第一个字母
        if (s.charAt(0) == '0') return 0;
        else dp[0] = 1;

        if (s.length() == 1) return dp[dp.length - 1];

        // 考虑第二字母
        if (s.charAt(1) != '0') dp[1] += 1;
        if (10 <= Integer.parseInt(s.substring(0, 2)) && Integer.parseInt(s.substring(0, 2)) <= 26) dp[1] += 1;
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i - 1) == '0' && s.charAt(i) == '0') return 0;
            if (s.charAt(i) != '0') dp[i] += dp[i - 1];
            if (10 <= Integer.parseInt(s.substring(i - 1, i + 1)) && Integer.parseInt(s.substring(i - 1, i + 1)) <= 26)
                dp[i] += dp[i - 2];
        }
        return dp[dp.length - 1];
                
    }
    
}
