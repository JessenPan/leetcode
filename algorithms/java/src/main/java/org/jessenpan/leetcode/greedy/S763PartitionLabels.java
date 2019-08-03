package org.jessenpan.leetcode.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S763PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        int[] map = new int[26];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            map[s.charAt(i) - 'a']++;
        }

        List<Integer> labels = new ArrayList<>();

        int lastIdx = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(s.charAt(i));
            map[s.charAt(i) - 'a']--;
            boolean hasFinished = true;
            for (Character c : list) {
                if (map[c - 'a'] != 0) {
                    hasFinished = false;
                    break;
                }
            }
            if (hasFinished) {
                labels.add(i - lastIdx + 1);
                lastIdx = i + 1;
                list.clear();
            }
        }
        return labels;
    }

}
