package org.jessenpan.leetcode.bit;

import java.util.*;

/**
 * @author jessenpan
 * tag:bit
 */
public class S756PyramidTransitionMatrix {

    public boolean pyramidTransition(String bottom, List<String> allowed) {
        Map<String, Set<Character>> record = new HashMap<>();
        for (String str : allowed) {
            String key = str.substring(0, 2);
            Set<Character> list = record.getOrDefault(key, new HashSet<>());
            list.add(str.charAt(2));
            record.put(key, list);
        }
        return canTans(bottom, "", record);
    }

    private boolean canTans(String bottom, String above, Map<String, Set<Character>> record) {
        if (bottom.length() == 2 && above.length() == 1) {
            return true;
        }

        if (above.length() + 1 == bottom.length()) {
            return canTans(above, "", record);
        }

        int size = above.length();
        String key = bottom.substring(size, size + 2);
        Set<Character> set = record.get(key);
        if (set == null) {
            return false;
        }
        for (Character character : set) {
            if (canTans(bottom, above + character, record)) {
                return true;
            }
        }
        return false;
    }

}
