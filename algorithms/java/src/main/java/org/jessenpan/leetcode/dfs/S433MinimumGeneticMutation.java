package org.jessenpan.leetcode.dfs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 */
public class S433MinimumGeneticMutation {

    int times = -1;

    Set<String> record = new HashSet<>();

    String target;

    Set<String> visited = new HashSet<>();

    public int minMutation(String start, String end, String[] bank) {

        record.addAll(Arrays.asList(bank));
        this.target = end;
        record.remove(start);
        find(start, 0);
        return times;
    }

    private void find(String current, int currentTimes) {
        if (current.equals(this.target)) {
            this.times = (this.times == -1 ? currentTimes : Math.min(this.times, currentTimes));
            return;
        }

        for (int i = 0; i < 8; i++) {
            // 0-A  1-C  2-G 3-T
            char c = current.charAt(i);
            for (int j = 0; j < 4; j++) {
                StringBuilder sb = new StringBuilder(current);
                if (j == 0 && c != 'A') {
                    sb.setCharAt(i, 'A');
                }
                if (j == 1 && c != 'C') {
                    sb.setCharAt(i, 'C');
                }
                if (j == 2 && c != 'G') {
                    sb.setCharAt(i, 'G');
                }
                if (j == 3 && c != 'T') {
                    sb.setCharAt(i, 'T');
                }
                String str = sb.toString();
                if (record.contains(str) && !current.equals(str) && !visited.contains(str)) {
                    visited.add(str);
                    find(str, currentTimes + 1);
                }
            }
        }
    }

}
