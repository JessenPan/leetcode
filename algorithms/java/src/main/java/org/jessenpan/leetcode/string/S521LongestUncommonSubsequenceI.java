package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S521LongestUncommonSubsequenceI {

    public int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}
