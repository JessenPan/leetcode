package org.jessenpan.leetcode.dp;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:dp
 */
public class S730CountDifferentPalindromicSubsequences {

    private int sum = 0;

    private Set<String> record = new HashSet<>();

    private int mod = (int) (Math.pow(10, 9) + 7);
    

    public int countPalindromicSubsequences(String s) {
        clac(s);
        return this.sum;
    }

    private void clac(String s) {
        if (s.isEmpty()) {
            return;
        }

        int len = s.length();
        clac(s.substring(0, len - 1));
        clac(s.substring(1, len));

        if (record.contains(s)) {
            return;
        }

        String subStr = "";
        if (len != 1) {
            subStr = s.substring(1, len - 1);
        }
        if (!record.contains(s) && (record.contains(subStr) || subStr.isEmpty()) && s.charAt(0) == s.charAt(len - 1)) {
            this.sum++;
            if (this.sum >= mod) {
                this.sum = this.sum % mod;
            }
            System.out.println(s);
            record.add(s);
        }
    }

}
