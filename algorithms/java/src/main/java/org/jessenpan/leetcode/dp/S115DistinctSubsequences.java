package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dp
 */
public class S115DistinctSubsequences {

    String s, t;

    Integer[][] record;

    public int numDistinct(String s, String t) {

        this.s = s;
        this.t = t;
        record = new Integer[s.length()][t.length()];

        return find(0, 0);
    }

    private int find(int sIdx, int tIdx) {

        if (tIdx == t.length()) {
            return 1;
        }

        if (s.length() - sIdx < t.length() - tIdx) {
            return 0;
        }
        if (record[sIdx][tIdx] != null) {
            return record[sIdx][tIdx];
        }
        int rs = 0;
        if (s.charAt(sIdx) == t.charAt(tIdx)) {
            rs += find(sIdx + 1, tIdx + 1);
        }
        rs += find(sIdx + 1, tIdx);
        record[sIdx][tIdx] = rs;
        return rs;
    }

}
