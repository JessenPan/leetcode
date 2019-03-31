package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S125ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int length = s.length();
        int startIndex = 0, endIndex = length - 1;
        while (startIndex < endIndex) {
            if (!isLetterOrNum(s.charAt(startIndex))) {
                startIndex++;
                continue;
            }
            if (!isLetterOrNum(s.charAt(endIndex))) {
                endIndex--;
                continue;
            }
            if (!isEqual(s.charAt(startIndex), s.charAt(endIndex))) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    private boolean isEqual(char char1, char char2) {
        if (isNum(char1) && isNum(char2)) {
            return char1 == char2;
        }
        if (isLetter(char1) && isLetter(char2)) {
            return toLowcase(char1) == toLowcase(char2);
        }
        return false;
    }

    private boolean isLetter(char aChar) {
        return (aChar >= 'A' && aChar <= 'Z') || (aChar >= 'a' && aChar <= 'z');
    }

    private char toLowcase(char aChar) {
        if (aChar >= 'A' && aChar <= 'Z') {
            return (char) (aChar + 32);
        }
        return aChar;
    }

    private boolean isNum(char aChar) {
        return aChar >= '0' && aChar <= '9';
    }

    private boolean isLetterOrNum(char aChar) {
        return (aChar >= 'A' && aChar <= 'Z') || (aChar >= 'a' && aChar <= 'z') || (aChar >= '0' && aChar <= '9');
    }
}
