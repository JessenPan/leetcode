package org.jessenpan.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:string
 */
public class S821ShortestDistanceToACharacter {

    public int[] shortestToChar(String s, char c) {
        List<Integer> pos = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                pos.add(i);
            }
        }

        int[] shortest = new int[chars.length];
        int len = shortest.length;
        for (int i = 0; i < len; i++) {

            if (chars[i] == c) {
                shortest[i] = 0;
                continue;
            }
            int min = Math.abs(i - pos.get(0));
            for (Integer po : pos) {
                min = Math.min(min, Math.abs(i - po));
            }
            shortest[i] = min;
        }

        return shortest;
    }

}
