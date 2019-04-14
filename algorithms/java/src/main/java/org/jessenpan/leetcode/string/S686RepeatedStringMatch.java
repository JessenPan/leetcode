package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S686RepeatedStringMatch {

    public int repeatedStringMatch(String a, String b) {
        if (a.length() > b.length()) {
            return -1;
        }
        int lengthOfA = a.length(), lengthOfB = b.length();
        StringBuilder sb = new StringBuilder(a);
        int repeatedTimes = 1;
        int i = 0, j = 0;
        boolean hasFound = false;
        while (i < lengthOfB && (hasFound)) {
            if (i < lengthOfA) {
                if (b.charAt(i) == a.charAt(j)) {
                    hasFound = true;
                } else {
                    j++;
                }
            }
            if (hasFound) {
                i++;
            }
        }
        return repeatedTimes;
    }

}
