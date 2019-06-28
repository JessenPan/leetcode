package org.jessenpan.leetcode.stack;

import java.util.List;
import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S636ExclusiveTimeOfFunctions {

    static class Pair {

        int id;
        int time;

        Pair(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }

    public int[] exclusiveTime(int n, List<String> logs) {
        int[] times = new int[n];
        Stack<Pair> stack = new Stack<>();
        for (String log : logs) {
            String[] splits = log.split(":");

            if (log.contains("start")) {
                stack.push(new Pair(Integer.parseInt(splits[0]), Integer.parseInt(splits[2])));
            } else {
                Pair pair = stack.pop();
                int cost = Integer.parseInt(splits[2]) - pair.time + 1;
                times[pair.id] += cost;
                if (!stack.isEmpty()) {
                    times[stack.peek().id] -= cost;
                }

            }
        }
        return times;
    }

}
