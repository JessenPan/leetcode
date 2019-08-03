package org.jessenpan.leetcode.greedy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S1090LargestValuesFromLabels {

    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {

        Map<Integer, List<Integer>> labelMap = new HashMap<>();
        int len = values.length;
        for (int i = 0; i < len; i++) {
            int label = labels[i];
            labelMap.computeIfAbsent(label, o -> new ArrayList<>());
            labelMap.get(label).add(values[i]);
        }

        List<Integer> total = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : labelMap.entrySet()) {
            if (entry.getValue().size() <= use_limit) {
                total.addAll(entry.getValue());
                continue;
            }
            List<Integer> limits = entry.getValue().stream().sorted((o1, o2) -> Integer.compare(o2, o1)).limit(use_limit).collect(Collectors.toList());
            total.addAll(limits);
        }
        return total.stream().sorted((o1, o2) -> Integer.compare(o2, o1)).limit(num_wanted).mapToInt(t -> t).sum();
    }

}
