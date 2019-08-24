package org.jessenpan.leetcode.math;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:math
 */
public class S640SolveTheEquation {

    public String solveEquation(String equation) {

        String[] strs = equation.split("=");
        if (!strs[0].startsWith("-")) {
            strs[0] = "+" + strs[0];
        }
        if (!strs[1].startsWith("-")) {
            strs[1] = "+" + strs[1];
        }

        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();

        compute(true, strs[0], left, right);
        compute(false, strs[1], left, right);
        if (left.isEmpty() && right.isEmpty() || (!left.isEmpty() && left.peek() == 0 && (right.isEmpty() || right.peek() == 0))) {
            return "Infinite solutions";
        }
        if (right.isEmpty()) {
            return "x=0";
        }
        if (!left.isEmpty() && left.peek() == 0) {
            return "No solution";
        }
        return "x=" + (right.pop() / left.pop());
    }

    private void compute(boolean side, String str, Stack<Integer> left, Stack<Integer> right) {

        int len = str.length();
        int i = 0, lastIdx;
        while (i < len) {
            lastIdx = i;
            i++;
            while (i < len && str.charAt(i) != '+' && str.charAt(i) != '-') {
                i++;
            }
            String sub = str.substring(lastIdx, i).replace("+", "");
            if (sub.contains("x")) {
                sub = sub.replace("x", "");
                sub = sub.isEmpty() ? "1" : sub;
                sub = sub.equals("-") ? "-1" : sub;
                if (left.isEmpty()) {
                    if (side) {
                        left.push(Integer.valueOf(sub));
                    } else {
                        left.push(-Integer.valueOf(sub));
                    }
                } else {
                    if (side) {
                        left.push(left.pop() + Integer.valueOf(sub));
                    } else {
                        left.push(left.pop() - Integer.valueOf(sub));
                    }
                }
            } else {
                sub = sub.isEmpty() ? "1" : sub;
                if (right.isEmpty()) {
                    if (side) {
                        right.push(-Integer.valueOf(sub));
                    } else {
                        right.push(Integer.valueOf(sub));
                    }
                } else {
                    if (side) {
                        right.push(right.pop() - Integer.valueOf(sub));
                    } else {
                        right.push(right.pop() + Integer.valueOf(sub));
                    }
                }
            }
        }
    }

}
