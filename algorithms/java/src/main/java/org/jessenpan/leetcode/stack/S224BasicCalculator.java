package org.jessenpan.leetcode.stack;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S224BasicCalculator {

    public int evaluateExpr(Stack<Object> stack) {

        int res = 0;
        if (!stack.empty()) {
            res = (int) stack.pop();
        }

        while (!stack.empty() && !((char) stack.peek() == ')')) {

            char sign = (char) stack.pop();
            if (sign == '+') {
                res += (int) stack.pop();
            } else {
                res -= (int) stack.pop();
            }
        }
        return res;
    }

    public int calculate(String s) {

        int operand = 0;
        int n = 0;
        Stack<Object> stack = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                operand = (int) Math.pow(10, n) * (ch - '0') + operand;
                n += 1;
            } else if (ch != ' ') {
                if (n != 0) {
                    stack.push(operand);
                    n = 0;
                    operand = 0;
                }
                if (ch == '(') {
                    int res = evaluateExpr(stack);
                    stack.pop();
                    stack.push(res);
                } else {
                    stack.push(ch);
                }
            }
        }

        if (n != 0) {
            stack.push(operand);
        }

        return evaluateExpr(stack);
    }

}
