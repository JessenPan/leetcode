package org.jessenpan.leetcode.binarysearch;

/**
 * @author jessenpan
 * tag:binarySearch
 */
public class S278FirstBadVersion {

    public int firstBadVersion(int n) {

        int left = 1, right = n;
        int middle;
        boolean isBadVersion;
        while (left < right) {
            middle = left + (right - left) / 2;
            isBadVersion = isBadVersion(middle);
            if (isBadVersion) {
                if (!isBadVersion(middle - 1)) {
                    return middle;
                } else {
                    right = middle - 1;
                }
            } else {
                if (isBadVersion(middle + 1)) {
                    return middle+1;
                } else {
                    left = middle + 1;
                }
            }
        }
        return left;
    }

    boolean isBadVersion(int version) {
        return version == 4;
    }

}
