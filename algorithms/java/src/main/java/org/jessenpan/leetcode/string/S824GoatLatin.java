package org.jessenpan.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:string
 */
public class S824GoatLatin {

    private static final Set<Character> VOWELS = new HashSet<>();

    private static final char SPACE = ' ';

    static {
        VOWELS.add('a');
        VOWELS.add('A');
        VOWELS.add('e');
        VOWELS.add('E');
        VOWELS.add('i');
        VOWELS.add('I');
        VOWELS.add('o');
        VOWELS.add('O');
        VOWELS.add('u');
        VOWELS.add('U');
    }

    private static final String SUFFIX = "ma";

    public String toGoatLatin(String str) {
        String[] strs = str.split(" ");
        StringBuilder sb = new StringBuilder();
        int length = strs.length;
        for (int i = 0; i < length; i++) {
            if (VOWELS.contains(strs[i].charAt(0))) {
                sb.append(strs[i]);
                sb.append(SUFFIX);
            }else{
                sb.append(strs[i].substring(1));
                sb.append(strs[i].charAt(0));
                sb.append(SUFFIX);
            }
            for (int j = 0; j < i + 1; j++) {
                sb.append('a');
            }
            if (i != (length - 1)) {
                sb.append(SPACE);
            }
        }
        return sb.toString();
    }
}
