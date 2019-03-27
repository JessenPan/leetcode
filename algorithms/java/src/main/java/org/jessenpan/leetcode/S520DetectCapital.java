package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:string
 */
public class S520DetectCapital {

    public boolean detectCapitalUse(String word) {
        int length = word.length();
        boolean firstLetterUpper = false;
        int upperCaseCount = 0;
        for (int i = 0; i < length; i++) {
            if (i == 0 && isUpperCase(word.charAt(i))) {
                firstLetterUpper = true;
                upperCaseCount++;
            } else if (i != 0 && !firstLetterUpper && isUpperCase(word.charAt(i))) {
                return false;
            } else if (isUpperCase(word.charAt(i))) {
                upperCaseCount++;
            }
        }
        return upperCaseCount <= 1 || upperCaseCount == length;
    }

    private boolean isLowerCase(char aChar) {
        return aChar >= 'a' && aChar <= 'z';
    }

    private boolean isUpperCase(char aChar) {
        return aChar >= 'A' && aChar <= 'Z';
    }
}
