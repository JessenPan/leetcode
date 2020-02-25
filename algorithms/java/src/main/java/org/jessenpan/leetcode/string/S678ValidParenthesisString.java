package org.jessenpan.leetcode.string;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:string
 */
public class S678ValidParenthesisString {

    //study 
    public boolean checkValidString(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(i, i + 1);
            if (temp.equals("(")) {
                left.push(i);
                continue;
            }
            if (temp.equals("*")) {
                star.push(i);
                continue;
            }
            if (")".equals(temp)) {
                if (!left.empty()) {
                    left.pop();
                    continue;
                }
                if (!star.empty()) {
                    star.pop();
                    continue;
                }
                return false;
            }
        }

        while (!left.empty()) {
            if (star.empty()) {
                return false;
            }
            if (left.peek() < star.peek()) {
                left.pop();
                star.pop();
            } else {
                return false;
            }
        }
        return true;
    }

}
