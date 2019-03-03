package org.jessenpan.leetcode.stack;

import java.util.Stack;

/**
 * @author jessenpan
 * @since 2019/3/3 0:15
 */
public class S856_ScoreOfParentheses {

    public int scoreOfParentheses(String s) {
        int result = 0;

        int lengthOfS = s.length();
        Stack<String> countStack = new Stack<>();
        for (int i = 0; i < lengthOfS; i++) {
            char charOfS = s.charAt(i);
            if (charOfS == '(') {
                countStack.push("(");
            } else {
                if (countStack.peek().equals("(")) {
                    countStack.pop();
                    countStack.push("1");
                } else {
                    int tmpScore = 0;
                    while (!countStack.peek().equals("(")) {
                        tmpScore += Integer.valueOf(countStack.pop());
                    }
                    tmpScore *= 2;
                    countStack.pop();
                    countStack.push(String.valueOf(tmpScore));
                }
            }
        }

        while (!countStack.isEmpty()) {
            result += Integer.valueOf(countStack.pop());
        }

        return result;
    }

}
