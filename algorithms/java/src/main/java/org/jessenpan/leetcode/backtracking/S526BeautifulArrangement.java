package org.jessenpan.leetcode.backtracking;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S526BeautifulArrangement {

    private int count = 0;

    public int countArrangement(int n) {

        calArrangement(n, 0, new HashSet<>());
        return count;
    }

    private void calArrangement(int n, int index, Set<Integer> sets) {
        if (index == n) {
            count++;
            return;
        }

        index++;
        for (int i = 1; i <= n; i++) {
            if (!sets.contains(i)) {
                if (i % index == 0 || index % i == 0) {
                    sets.add(i);
                    calArrangement(n, index, sets);
                    sets.remove(i);
                }

            }
        }

    }

}
