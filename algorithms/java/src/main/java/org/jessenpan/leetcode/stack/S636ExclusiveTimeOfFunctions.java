package org.jessenpan.leetcode.stack;

import java.util.List;
import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S636ExclusiveTimeOfFunctions {

    public int[] exclusiveTime(int n, List<String> logs) {
        int[] times = new int[n];
        Stack<String[]> stack = new Stack<>();
        for (String log : logs) {
            String[] str = log.split(":");
            if (str[1].equals("start")) {
                stack.push(new String[] { str[0], str[2], str[2] });
            } else {
                String[] pop = stack.pop();
                int dur = Integer.parseInt(str[2]) - Integer.parseInt(pop[1]) + 1;
                times[Integer.parseInt(pop[0])] += dur;
                if (stack.size() > 0) {
                    String[] peek = stack.peek();
                    peek[1] = Integer.parseInt(peek[1]) + Integer.parseInt(str[2]) - Integer.parseInt(pop[2]) + 1 + "";
                }
            }
        }
        return times;
    }

}
