package org.jessenpan.leetcode.map;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:array
 */
public class S1078OccurrencesAfterBigram {

    public String[] findOcurrences(String text, String first, String second) {
        String[] arr = text.split(" ");
        int len = arr.length, i = 0;
        len -= 2;
        List<String> ocurrences = new ArrayList<>();
        while (i < len) {
            if (first.equals(arr[i]) && second.equals(arr[i + 1])) {
                ocurrences.add(arr[i + 2]);
            }
            i++;
        }
        return ocurrences.toArray(new String[0]);
    }

}
