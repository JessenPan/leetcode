package org.jessenpan.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author jessenpan
 * tag:math
 */
public class S13RomanToInteger {

    private static final Map<Character, Integer> ROMAN_MAP = new HashMap<>();
    private static final Set<Integer> DIFF = new HashSet<>();

    static {
        ROMAN_MAP.put('I', 1);
        ROMAN_MAP.put('V', 5);
        ROMAN_MAP.put('X', 10);
        ROMAN_MAP.put('L', 50);
        ROMAN_MAP.put('C', 100);
        ROMAN_MAP.put('D', 500);
        ROMAN_MAP.put('M', 1000);

        DIFF.add(4);
        DIFF.add(9);
        DIFF.add(40);
        DIFF.add(90);
        DIFF.add(400);
        DIFF.add(900);
    }

    public int romanToInt(String s) {
        int lengthOfS = s.length();
        int intOfRoman = 0;
        for (int i = 0; i < lengthOfS; ) {
            if (i == (lengthOfS - 1)) {
                intOfRoman += ROMAN_MAP.get(s.charAt(i));
                i++;
            } else {
                char charAtNow = s.charAt(i);
                char charAtNext = s.charAt(i + 1);
                if (DIFF.contains(ROMAN_MAP.get(charAtNext) - ROMAN_MAP.get(charAtNow))) {
                    intOfRoman += ROMAN_MAP.get(charAtNext) - ROMAN_MAP.get(charAtNow);
                    i += 2;
                } else {
                    intOfRoman += ROMAN_MAP.get(s.charAt(i));
                    i++;
                }
            }
        }
        return intOfRoman;
    }
}
