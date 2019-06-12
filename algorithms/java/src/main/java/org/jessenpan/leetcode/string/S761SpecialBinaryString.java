package org.jessenpan.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:string
 */
public class S761SpecialBinaryString {

    private String theMax = "";

    private Set<String> record = new HashSet<>();

    public String makeLargestSpecial(String s) {
        this.theMax = s;
        findLargestSpecial(s);
        return theMax;
    }

    private void findLargestSpecial(String s) {
        record.add(s);
        int len = s.length();
        for (int i = 0; i < len; i++) {
            String specialStr = parseSpecialStr(i == 0 ? s : s.substring(i));
            if (specialStr == null || i + specialStr.length() == len || !isMatch(specialStr)) {
                continue;
            }
            String anotherSpecial = parseSpecialStr(s.substring(i + specialStr.length()));
            if (anotherSpecial == null || !isMatch(anotherSpecial)) {
                continue;
            }
            String newStr = s.substring(0, i) + anotherSpecial + specialStr + s.substring(i + specialStr.length() + anotherSpecial.length());
            if (isMatch(newStr) && !record.contains(newStr)) {

                record.add(newStr);
                if (newStr.compareTo(theMax) > 0) {
                    theMax = newStr;
                    findLargestSpecial(newStr);
                }

            }
        }
    }

    private boolean isMatch(String str) {
        if (str.isEmpty()) {
            return false;
        }
        int numOfOne = 0, numOfZero = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '1') {
                numOfOne++;
            } else {
                numOfZero++;
            }
            if (numOfOne < numOfZero) {
                return false;
            }
        }
        return true;
    }

    private String parseSpecialStr(String s) {
        int len = s.length();
        int numOfOne = 0, numOfZero = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1') {
                numOfOne++;
            } else {
                numOfZero++;
            }
            if (numOfOne == numOfZero && numOfOne != 0) {
                return s.substring(0, i + 1);
            }
            if (numOfOne < numOfZero) {
                return null;
            }
        }
        return null;
    }
}
