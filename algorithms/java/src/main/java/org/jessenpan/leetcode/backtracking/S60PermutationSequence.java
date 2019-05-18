package org.jessenpan.leetcode.backtracking;

import java.util.*;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S60PermutationSequence {

    private int times;

    private int count = 0;

    private int n;

    private StringBuilder permutation = new StringBuilder();

    public String getPermutation(int n, int k) {
        this.times = k;
        this.n = n;
        findNthPermutation(new LinkedList<Integer>(), new HashSet<Integer>(), 0);
        return permutation.toString();
    }

    private boolean findNthPermutation(Deque<Integer> stack, Set<Integer> sets, int index) {

        if (index == n) {
            count++;
            if (count == times) {
                while (!stack.isEmpty()) {
                    permutation.append(stack.removeFirst());
                }
            }
            return count == times;
        }

        for (int i = 1; i <= n; i++) {
            if (!sets.contains(i)) {
                sets.add(i);
                stack.addLast(i);
                if (findNthPermutation(stack, sets, index + 1)) {
                    return true;
                }
                stack.removeLast();
                sets.remove(i);
            }
        }
        return false;
    }

}
