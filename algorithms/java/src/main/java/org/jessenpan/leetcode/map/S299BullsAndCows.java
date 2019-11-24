package org.jessenpan.leetcode.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S299BullsAndCows {

    public String getHint(String secret, String guess) {
        Map<Character, Integer> secretMap = new HashMap<>();
        char[] secretArrays = secret.toCharArray();
        for (char secretC : secretArrays) {
            secretMap.put(secretC, secretMap.getOrDefault(secretC, 0) + 1);
        }

        int minLen = Math.min(secret.length(), guess.length());

        Map<Character, Integer> result = new HashMap<>();
        char[] guessArrays = guess.toCharArray();
        for (int i = 0; i < minLen; i++) {
            if (guessArrays[i] == secretArrays[i]) {
                result.put('A', result.getOrDefault('A', 0) + 1);
                secretMap.put(guessArrays[i], secretMap.get(guessArrays[i]) - 1);
                guessArrays[i] = 'a';
            }
        }

        int len = guessArrays.length;
        for (int i = 0; i < len; i++) {
            if (guessArrays[i] == 'a') {
                continue;
            }

            Integer val = secretMap.get(guessArrays[i]);
            if (val != null && val >= 1) {
                result.put('B', result.getOrDefault('B', 0) + 1);
                secretMap.put(guessArrays[i], val - 1);
            }
        }

        return (result.get('A') == null ? "0" : result.get('A')) + "A" + (result.get('B') == null ? "0" : result.get('B')) + "B";
    }

}
