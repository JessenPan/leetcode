package org.jessenpan.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:string
 */
public class S833FindAndReplaceInString {

    public String findReplaceString(String s, int[] indexes, String[] sources, String[] targets) {

        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < indexes.length; i++) {
            String com = s.substring(indexes[i], indexes[i] + sources[i].length());
            if (com.equals(sources[i])) {
                map.put(indexes[i], i);
            }
        }
        int len = s.length();
        int i = 0;
        while (i < len) {
            if (map.containsKey(i)) {
                str.append(targets[map.get(i)]);
                i += sources[map.get(i)].length();
            } else {
                str.append(s.charAt(i));
                i++;
            }
        }
        return str.toString();
    }

}
