package org.jessenpan.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author jessenpan
 */
public class S394_DecodeString {

    private static final char LEFT_BRACKET = '[';

    private static final char RIGHT_BRACKET = ']';

    public String decodeString(String s) {
        if (s == null || "".equals(s)) {
            return s;
        }
        int lengthOfs = s.length();
        int lastIndex = 0;
        boolean hasFoundOperation = false;
        Deque<String> stringDeque = new LinkedList<>();
        for (int i = 0; i < lengthOfs; i++) {
            char currentChar = s.charAt(i);
            if (LEFT_BRACKET == currentChar) {
                String strBeforeLeftBracket = s.substring(lastIndex, i);
                if (isOperation(strBeforeLeftBracket)) {
                    stringDeque.push(strBeforeLeftBracket);
                } else {

                }
                lastIndex = i + 1;
            } else if (RIGHT_BRACKET == currentChar) {
                String strBeforeRightBracket = s.substring(lastIndex, i);
                int loopTime = Integer.valueOf(stringDeque.poll());
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < loopTime; j++) {
                    sb.append(strBeforeRightBracket);
                }
                stringDeque.push(sb.toString());
                lastIndex = i + 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stringDeque.isEmpty()) {
            sb.append(stringDeque.pollLast());
        }
        return sb.toString();
    }

    private boolean isOperation(char ch) {
        return ch >= '0' && ch <= '9';
    }

    private boolean isOperation(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
