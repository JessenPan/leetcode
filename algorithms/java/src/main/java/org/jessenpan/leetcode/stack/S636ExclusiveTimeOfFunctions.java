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
        Stack<String> stack = new Stack<>();
        for (String log : logs) {

            if (log.contains("start")) {
                stack.push(log);
                continue;
            }

            //            if (stack.peek().contains("start")) {
            //                stack.push(log);
            //                continue;
            //            }

            String[] pops = stack.pop().split(":");
            String[] splits = log.split(":");

            times[Integer.parseInt(pops[0])] = Integer.parseInt(splits[2]) - Integer.parseInt(pops[2]) + 1;

        }
        for (int i = 0; i < n; i++) {
            if (i != (n - 1)) {
                times[i] = times[i] - times[i + 1];
            }
        }
        return times;
    }

}
