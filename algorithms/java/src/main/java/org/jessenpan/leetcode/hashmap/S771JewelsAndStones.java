package org.jessenpan.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S771JewelsAndStones {

    public int numJewelsInStones(String j, String s) {
        Map<Character, Integer> counter = new HashMap<>();
        int lengthOfS = s.length();
        for (int i = 0; i < lengthOfS; i++) {
            char charAtIndex = s.charAt(i);
            Integer singleCounter = counter.get(charAtIndex);
            singleCounter = singleCounter == null ? 1 : ++singleCounter;
            counter.put(charAtIndex, singleCounter);
        }
        int lengthOfJ = j.length();
        int charNumInS = 0;
        for (int i = 0; i < lengthOfJ; i++) {
            char charAtIndex = j.charAt(i);
            if (counter.get(charAtIndex) != null) {
                charNumInS += counter.get(charAtIndex);
            }
        }
        return charNumInS;
    }

}
