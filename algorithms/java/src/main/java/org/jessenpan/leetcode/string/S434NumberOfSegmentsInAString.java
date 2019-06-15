package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S434NumberOfSegmentsInAString {

    public int countSegments(String s) {
        if (s.isEmpty() || s.trim().isEmpty()) {
            return 0;
        }
        String[] words = s.trim().split(",");
        int sum = 0;
        for (String word : words) {
            sum += word.trim().split(" ").length;
        }
        return sum;
    }

}
