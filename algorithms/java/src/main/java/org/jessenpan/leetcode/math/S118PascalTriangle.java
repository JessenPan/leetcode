package org.jessenpan.leetcode.math;

import java.util.*;

/**
 * @author jessenpan
 * tag:math
 */
public class S118PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return Collections.emptyList();
        }

        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for (int row = 1; row <= numRows; row++) {
            if (row == 1) {
                pascalTriangle.add(Collections.singletonList(1));
                continue;
            }
            if (row == 2) {
                pascalTriangle.add(Arrays.asList(1, 1));
                continue;
            }
            List<Integer> rowList = new LinkedList<>();
            for (int i = 0; i < row; i++) {
                if (i == 0) {
                    rowList.add(1);
                    continue;
                }
                if (i == (row - 1)) {
                    rowList.add(1);
                    continue;
                }
                rowList.add(pascalTriangle.get(row - 2).get(i - 1) + pascalTriangle.get(row - 2).get(i));
            }
            pascalTriangle.add(rowList);
        }
        return pascalTriangle;
    }

}
