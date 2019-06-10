package org.jessenpan.leetcode.string;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jessenpan
 * tag:string
 */
public class S791CustomSortString {

    public String customSortString(String s, String t) {
        int lenOfS = s.length();
        int[] array = new int[26];
        for (int i = 0; i < lenOfS; i++) {
            array[s.charAt(i) - 'a'] = i + 1;
        }
        char[] chars = t.toCharArray();
        Character[] characters = new Character[chars.length];
        int lenOfChar = chars.length;
        for (int i = 0; i < lenOfChar; i++) {
            characters[i] = chars[i];
        }
        Arrays.sort(characters, new Comparator<Character>() {

            @Override
            public int compare(Character o1, Character o2) {
                if (o1 == null && o2 == null) {
                    return 0;
                }
                if (o1 == null) {
                    return -1;
                }
                if (o2 == null) {
                    return 1;
                }

                int indexOfO1 = array[o1 - 'a'];
                int indexOfO2 = array[o2 - 'a'];
                return Integer.compare(indexOfO1, indexOfO2);
            }
        });
        for (int i = 0; i < lenOfChar; i++) {
            chars[i] = characters[i];
        }
        return new String(chars);
    }

}
