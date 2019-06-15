package org.jessenpan.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jessenpan
 * tag:string
 */
public class S916WordSubsets {

    public List<String> wordSubsets(String[] A, String[] B) {
        int[] cntMap = new int[26];
        for (String bWord : B) {
            int[] map = new int[26];
            for (char ch : bWord.toCharArray()) {
                map[ch - 'a']++;
            }
            for (int i = 0; i < 26; ++i) {
                cntMap[i] = Math.max(cntMap[i], map[i]);
            }
        }

        Map<String, int[]> record = new HashMap<>();

        List<String> result = new ArrayList<>();
        for (String aWord : A) {

            int[] map = record.get(aWord);
            if (map == null) {
                map = new int[26];
                record.put(aWord, map);
                for (char ch : aWord.toCharArray()) {
                    map[ch - 'a']++;
                }
            }
            boolean isFound = true;
            for (int i = 0; i < 26; ++i) {
                if (cntMap[i] > map[i]) {
                    isFound = false;
                    break;
                }
            }
            if (isFound) {
                result.add(aWord);
            }
        }
        return result;
    }

}
