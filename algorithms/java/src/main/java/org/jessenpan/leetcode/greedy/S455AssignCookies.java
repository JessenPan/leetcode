package org.jessenpan.leetcode.greedy;

import java.util.Arrays;

/**
 * @author jessenpan
 */
public class S455AssignCookies {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int n = 0;
        int lenOfg = g.length, lenOfs = s.length;
        int idxOfs = 0, idxOfg = 0;
        while (idxOfs < lenOfs && idxOfg < lenOfg) {
            if (s[idxOfs] >= g[idxOfg]) {
                n++;
                idxOfg++;
                idxOfs++;
            } else {
                idxOfs++;
            }
        }

        return n;
    }

}
