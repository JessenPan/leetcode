package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S165CompareVersionNumbers {

    public int compareVersion(String version1, String version2) {
        String[] version1Arr = version1.split("\\.");
        String[] version2Arr = version2.split("\\.");

        int len = Math.min(version1Arr.length, version2Arr.length);
        for (int i = 0; i < len; i++) {

            int subVer1 = Integer.parseInt(version1Arr[i]);
            int subVer2 = Integer.parseInt(version2Arr[i]);
            if (subVer1 > subVer2) {
                return 1;
            } else if (subVer1 < subVer2) {
                return -1;
            }
        }

        if (version1Arr.length == version2Arr.length) {
            return 0;
        }

        String[] versions = version1Arr.length > version2Arr.length ? version1Arr : version2Arr;
        len = Math.max(version1Arr.length, version2Arr.length);
        boolean isAllZero = true;
        for (int i = Math.min(version1Arr.length, version2Arr.length); i < len; i++) {
            if (Integer.parseInt(versions[i]) != 0) {
                isAllZero = false;
                break;
            }
        }

        if (isAllZero) {
            return 0;
        }
        return Integer.compare(version1Arr.length, version2Arr.length);
    }

}
