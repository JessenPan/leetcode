package org.jessenpan.leetcode.backtracking;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S44WildcardMatching {

    //TODO study
    public boolean isMatch(String text, String p) {
        int sLen = text.length(), pLen = p.length();
        int sIdx = 0, pIdx = 0;
        int starIdx = -1, sTmpIdx = -1;

        while (sIdx < sLen) {
            if (pIdx < pLen && (p.charAt(pIdx) == '?' || p.charAt(pIdx) == text.charAt(sIdx))) {
                ++sIdx;
                ++pIdx;
            } else if (pIdx < pLen && p.charAt(pIdx) == '*') {
                starIdx = pIdx;
                sTmpIdx = sIdx;
                ++pIdx;
            } else if (starIdx == -1) {
                return false;
            } else {
                pIdx = starIdx + 1;
                sIdx = sTmpIdx + 1;
                sTmpIdx = sIdx;
            }
        }

        for (int i = pIdx; i < pLen; i++) {
            if (p.charAt(i) != '*') {
                return false;
            }
        }
        return true;
    }

}
