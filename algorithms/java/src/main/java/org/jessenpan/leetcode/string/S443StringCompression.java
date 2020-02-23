package org.jessenpan.leetcode.string;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author jessenpan
 * tag:string
 */
public class S443StringCompression {

    public int compress(char[] chars) {
        Stack<Character> compressedEles = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] newChars = Arrays.copyOf(chars, chars.length);
        int count = 0, length = chars.length, idx = 0;
        for (int i = 0; i < length; i++) {
            if (compressedEles.isEmpty()) {
                compressedEles.push(newChars[i]);
                count++;
                chars[idx] = newChars[i];
                idx++;
            } else if (newChars[i] == compressedEles.peek()) {
                count++;
                if (i == (length - 1)) {
                    sb.append(count);
                    idx = fulfill(chars, count, idx);
                }
            } else {
                if (count != 1) {
                    sb.append(count);
                    idx = fulfill(chars, count, idx);
                }
                count = 1;
                compressedEles.push(newChars[i]);
                chars[idx] = newChars[i];
                idx++;
            }
        }

        return compressedEles.size() + sb.length();
    }

    private int fulfill(char[] chars, int count, int idx) {
        String sCount = String.valueOf(count);
        int l = sCount.length();
        for (int j = 0; j < l; j++) {
            chars[idx] = sCount.charAt(j);
            idx++;
        }
        return idx;
    }

}
