package org.jessenpan.leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jessenpan
 * tag:graph
 */
public class S997FindTheTownJudge {


    public int findJudge(int N, int[][] trust) {

        Integer[] marks = new Integer[N];
        Map<Integer, List<Integer>> record = new HashMap<>();
        for (int[] aTrust : trust) {
            if (marks[aTrust[0] - 1] == null) {
                marks[aTrust[0] - 1] = 1;
            } else {
                marks[aTrust[0] - 1]++;
            }
            record.computeIfAbsent(aTrust[0] - 1, integer -> new ArrayList<>());
            record.get(aTrust[0] - 1).add(aTrust[1] - 1);
        }

        boolean hasJudge = false;
        int judge = -1, len = marks.length;
        for (int i = 0; i < len; i++) {
            if (marks[i] == null) {
                if (hasJudge) {
                    return -1;
                } else {
                    hasJudge = true;
                    judge = i;
                }
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : record.entrySet()) {
            if (!isTrustJudge(entry.getValue(), judge)) {
                return -1;
            }
        }

        return judge + 1;
    }

    private boolean isTrustJudge(List<Integer> peoples, int judge) {
        for (Integer people : peoples) {

            if (people == judge) {
                return true;
            }

        }
        return false;
    }
}
