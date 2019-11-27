package org.jessenpan.leetcode.string;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:string
 */
public class S1106ParsingABooleanExpression {

    public boolean parseBoolExpr(String expression) {
        if (expression.equals("t") || expression.equals("f")) {
            return expression.equals("t");
        }

        if (expression.startsWith("!")) {
            return !parseBoolExpr(expression.substring(2, expression.length() - 1));
        }

        Boolean v = null;
        Stack<Character> chars = new Stack<>();
        Stack<Character> ops = new Stack<>();
        char[] array = expression.toCharArray();
        for (char c : array) {
            if (isOp(c)) {
                ops.push(c);
            } else if (c == ')') {
                while (chars.peek() != '(') {
                    if (ops.peek() == '!') {
                        v = !(chars.pop() == 't');
                    } else if (v == null) {
                        v = chars.pop() == 't';
                    } else {
                        if (ops.peek() == '&') {
                            v = v & (chars.pop() == 't');
                        } else if (ops.peek() == '|') {
                            v = v | (chars.pop() == 't');
                        }
                    }
                }
                chars.pop();
                ops.pop();
                chars.push(v ? 't' : 'f');
                v = null;
            } else if (c != ',') {
                chars.push(c);
            }
        }
        return chars.pop() == 't';
    }

    private boolean isOp(char c) {
        return c == '&' || c == '|' || c == '!';
    }

}
