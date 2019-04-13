package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 * tag:array
 */
public class S830PositionsOfLargeGroups {

    private static final int THRESHOLD = 3;

    public List<List<Integer>> largeGroupPositions(String str) {
        List<List<Integer>> positionGroup = new ArrayList<>();
        int length = str.length();
        int startIndex = 0;
        for (int i = 0; i < length; i++) {
            if (i == (length - 1)) {
                if (i - startIndex + 1 >= THRESHOLD) {
                    positionGroup.add(Arrays.asList(startIndex, i));
                }
            } else if (str.charAt(i) != str.charAt(i + 1)) {
                if (i - startIndex + 1 >= THRESHOLD) {
                    positionGroup.add(Arrays.asList(startIndex, i));
                }
                startIndex = i + 1;
            }
        }
        return positionGroup;
    }
}
