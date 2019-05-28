package org.jessenpan.leetcode.backtracking;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S44WildcardMatching {

    public boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()) {
            return text.isEmpty();
        }

        boolean isMatch = !text.isEmpty() && (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '?');
        if (pattern.charAt(0) == '*') {
            if (isMatch(text, pattern.substring(1))) {
                return true;
            }

            if (text.length() == 1 && pattern.length() == 1 && pattern.charAt(0) == '*') {
                return true;
            }

            for (int i = 1; i < text.length(); i++) {
                if (isMatch(text.substring(i), pattern)) {
                    return true;
                }
            }
            return false;
        } else {
            return isMatch && isMatch(text.substring(1), pattern.substring(1));
        }
    }

}
