package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:string
 */
public class S28ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (haystack.isEmpty() && needle.isEmpty()) {
            return 0;
        }
        if (haystack.isEmpty()) {
            return -1;
        }
        if (needle.isEmpty()) {
            return 0;
        }
        int index = -1;
        int nestedIndex;
        boolean hasFound = false;
        int lengthOfHaystack = haystack.length(), lengthOfNeedle = needle.length();
        for (int i = 0; i < lengthOfHaystack; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                nestedIndex = i;
                for (int j = 0; j < lengthOfNeedle && nestedIndex < lengthOfHaystack; j++) {
                    if (haystack.charAt(nestedIndex) != needle.charAt(j)) {
                        break;
                    } else if (haystack.charAt(nestedIndex) == needle.charAt(j) && j == (lengthOfNeedle - 1)) {
                        hasFound = true;
                    }
                    nestedIndex++;
                }
                if (hasFound) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
}
