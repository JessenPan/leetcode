package org.jessenpan.leetcode.map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S748ShortestCompletingWord {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] licenseMap = convertStrToMap(licensePlate);
        int length = words.length;
        int index = -1;
        for (int i = 0; i < length; i++) {
            int[] wordMap = convertStrToMap(words[i]);
            if (isMatch(licenseMap, wordMap)) {
                if (index == -1) {
                    index = i;
                } else if (words[i].length() < words[index].length()) {
                    index = i;
                }
            }
        }
        return words[index];
    }

    private boolean isMatch(int[] base, int[] compared) {
        for (int i = 0; i < 26; i++) {
            if (base[i] > compared[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] convertStrToMap(String licensePlate) {
        int[] map = new int[26];
        int length = licensePlate.length();
        for (int i = 0; i < length; i++) {
            char c = licensePlate.charAt(i);
            if (c >= 'a' && c <= 'z') {
                map[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z') {
                map[c - 'A']++;
            }
        }
        return map;
    }
}
