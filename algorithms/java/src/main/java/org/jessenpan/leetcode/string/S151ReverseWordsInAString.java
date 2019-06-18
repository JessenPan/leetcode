package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S151ReverseWordsInAString {

    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        String[] words = s.trim().split(" ");
        int len = words.length;
        StringBuilder sb = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            if (words[i].isEmpty()) {
                continue;
            }
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}
