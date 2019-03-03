package org.jessenpan.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author jessenpan
 * @since 2019/2/27 22:32
 */
public class S150_EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {

        if (tokens == null || tokens.length == 0) {
            return 0;
        }

        OpStrategyDispatcher dispatcher = new OpStrategyDispatcher();
        Stack<Integer> expression = new Stack<>();
        int lengthOfOps = tokens.length;
        for (int i = 0; i < lengthOfOps; i++) {
            String op = tokens[i];
            OpStrategy opStrategy = dispatcher.dispatch(op);
            opStrategy.processPoint(expression, op);
        }

        return expression.pop();
    }

    static class OpStrategyDispatcher {

        private Map<String, OpStrategy> map = new HashMap<>();

        private OpStrategy defaultOpStrategy;

        public OpStrategyDispatcher() {
            defaultOpStrategy = new DefaultOpStrategy();
            map.put("+", new AdditiveOpStrategy());
            map.put("-", new MinusOpStrategy());
            map.put("*", new MultiOpStrategy());
            map.put("/", new DivisionOpStrategy());
        }

        public OpStrategy dispatch(String cmd) {
            OpStrategy foundOpStrategy = map.get(cmd);
            return foundOpStrategy == null ? defaultOpStrategy : foundOpStrategy;
        }
    }

    interface OpStrategy {

        void processPoint(Stack<Integer> pointStack, String cmd);
    }

    static class DefaultOpStrategy implements OpStrategy {

        @Override
        public void processPoint(Stack<Integer> pointStack, String cmd) {
            Integer intVal = Integer.valueOf(cmd);
            pointStack.push(intVal);
        }
    }

    static class AdditiveOpStrategy implements OpStrategy {

        @Override
        public void processPoint(Stack<Integer> pointStack, String cmd) {
            Integer lastPoint = pointStack.pop();
            Integer lastLastPoint = pointStack.pop();

            Integer currentPoint = lastPoint + lastLastPoint;
            pointStack.push(currentPoint);
        }
    }

    static class MultiOpStrategy implements OpStrategy {

        @Override
        public void processPoint(Stack<Integer> pointStack, String cmd) {
            Integer lastPoint = pointStack.pop();
            Integer lastLastPoint = pointStack.pop();

            Integer currentPoint = lastPoint * lastLastPoint;
            pointStack.push(currentPoint);
        }
    }

    static class MinusOpStrategy implements OpStrategy {

        @Override
        public void processPoint(Stack<Integer> pointStack, String cmd) {
            Integer lastPoint = pointStack.pop();
            Integer lastLastPoint = pointStack.pop();

            pointStack.push(lastLastPoint - lastPoint);
        }
    }

    static class DivisionOpStrategy implements OpStrategy {

        @Override
        public void processPoint(Stack<Integer> pointStack, String cmd) {
            Integer lastPoint = pointStack.pop();
            Integer lastLastPoint = pointStack.pop();

            pointStack.push(lastLastPoint / lastPoint);
        }
    }
}
