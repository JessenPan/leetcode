package org.jessenpan.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author jessenpan
 * @since 2019/2/23 23:22
 */
public class S682_BaseballGame {

    public int calPoints(String[] ops) {

        if (ops == null || ops.length == 0) {
            return 0;
        }
        OpStrategyDispatcher dispatcher=new OpStrategyDispatcher();
        int lengthOfOps = ops.length;
        Stack<Integer> pointStack = new Stack<>();
        for (int i = 0; i < lengthOfOps; i++) {
            String op = ops[i];
            OpStrategy opStrategy=dispatcher.dispatch(op);
            opStrategy.processPoint(pointStack,op);
        }
        return pointStack.parallelStream().mapToInt(value -> value).sum();
    }

    static class OpStrategyDispatcher {

        private Map<String, OpStrategy> map = new HashMap<>();

        private OpStrategy defaultOpStrategy;

        public OpStrategyDispatcher() {
            defaultOpStrategy = new CommonOpStrategy();
            map.put("+", new AdditiveOpStrategy());
            map.put("C", new RemoveOpStrategy());
            map.put("D", new DoubleOpStrategy());
        }

        public OpStrategy dispatch(String cmd) {
            OpStrategy foundOpStrategy = map.get(cmd);
            return foundOpStrategy == null ? defaultOpStrategy : foundOpStrategy;
        }
    }

    interface OpStrategy {

        void processPoint(Stack<Integer> pointStack, String cmd);
    }

    static class CommonOpStrategy implements OpStrategy {

        @Override
        public void processPoint(Stack<Integer> pointStack, String cmd) {
            Integer intVal = Integer.valueOf(cmd);
            pointStack.push(intVal);
        }
    }

    static class AdditiveOpStrategy implements OpStrategy {

        @Override
        public void processPoint(Stack<Integer> pointStack, String cmd) {
            Integer lastPoint= pointStack.pop();
            Integer lastLastPoint=pointStack.pop();
            
            Integer currentPoint=lastPoint+lastLastPoint;
            pointStack.push(lastLastPoint);
            pointStack.push(lastPoint);
            pointStack.push(currentPoint);
        }
    }

    static class DoubleOpStrategy implements OpStrategy {

        @Override
        public void processPoint(Stack<Integer> pointStack, String cmd) {
            Integer lastPoint= pointStack.pop();
            Integer currentPoint=lastPoint*2;
            pointStack.push(lastPoint);
            pointStack.push(currentPoint);
        }
    }

    static class RemoveOpStrategy implements OpStrategy {

        @Override
        public void processPoint(Stack<Integer> pointStack, String cmd) {
            pointStack.pop();
        }
    }
}
