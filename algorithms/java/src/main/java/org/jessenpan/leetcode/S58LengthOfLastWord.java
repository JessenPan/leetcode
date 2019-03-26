package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:string
 */
public class S58LengthOfLastWord {

    private static final char SPACE = ' ';

    public int lengthOfLastWord(String s) {
        s = s.trim();
        String lastWord = "";
        int length = s.length();
        int lastIndex = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == SPACE) {
                lastWord = s.substring(lastIndex, i);
                lastIndex = i + 1;
            } else if (i == (length - 1)) {
                lastWord = s.substring(lastIndex);
            }
        }
        return lastWord.length();
    }
}
