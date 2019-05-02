package org.jessenpan.leetcode.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S438FindAllAnagramsInAString {

    private int[] recordOfS = new int[26], recordOfP = new int[26];

    public List<Integer> findAnagrams(String s, String p) {
        int lenOfS = s.length(), lenOfP = p.length();

        if (lenOfS == lenOfP && s.equals(p)) {
            return Arrays.asList(0);
        }

        List<Integer> anagramIndexs = new ArrayList<>();
        String subStr;
        for (int i = 0; i < lenOfS; i++) {
            if (lenOfS - i < lenOfP) {
                break;
            }
            subStr = s.substring(i, i + lenOfP);
            if (subStr.equals(p) || isAnagram(subStr, p)) {
                anagramIndexs.add(i);
            }
            clear(recordOfS);
            clear(recordOfP);
        }
        return anagramIndexs;
    }

    private boolean isAnagram(String subStr, String p) {
        if (subStr.equals(p)) {
            return false;
        }
        int len = subStr.length();
        for (int i = 0; i < len; i++) {
            recordOfS[subStr.charAt(i) - 'a']++;
            recordOfP[p.charAt(i) - 'a']++;
        }
        return Arrays.equals(recordOfP, recordOfS);
    }

    private void clear(int[] record) {
        int len = record.length;
        for (int i = 0; i < len; i++) {
            record[i] = 0;
        }
    }
}
