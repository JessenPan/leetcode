package org.jessenpan.leetcode.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S205IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> reversedMap = new HashMap<>();
        int length = s.length();
        Character mappedChar;
        for (int i = 0; i < length; i++) {
            mappedChar = map.get(s.charAt(i));
            if (mappedChar == null) {
                if (reversedMap.get(t.charAt(i)) != null) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
                reversedMap.put(t.charAt(i), s.charAt(i));
            } else if (mappedChar != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
