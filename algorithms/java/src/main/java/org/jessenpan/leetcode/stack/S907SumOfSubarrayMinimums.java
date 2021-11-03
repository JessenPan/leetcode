package org.jessenpan.leetcode.stack;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S907SumOfSubarrayMinimums {

    public int sumSubarrayMins(int[] A) {
        int MOD = 1_000_000_007;
        int N = A.length;

        Stack<Integer> stack = new Stack<>();
        int[] prev = new int[N];
        for (int i = 0; i < N; ++i) {
            while (!stack.isEmpty() && A[i] <= A[stack.peek()]) {
                stack.pop();
            }
            prev[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack = new Stack<>();
        int[] next = new int[N];
        for (int k = N - 1; k >= 0; --k) {
            while (!stack.isEmpty() && A[k] < A[stack.peek()]) {
                stack.pop();
            }
            next[k] = stack.isEmpty() ? N : stack.peek();
            stack.push(k);
        }

        long ans = 0;
        for (int i = 0; i < N; ++i) {
            ans += (i - prev[i]) * (next[i] - i) % MOD * A[i] % MOD;
            ans %= MOD;
        }
        return (int) ans;
    }

}
