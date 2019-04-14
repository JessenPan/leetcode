package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:array
 */
public class S1018BinaryPrefixDivisibleBy5 {

    public List<Boolean> prefixesDivBy5(int[] array) {

        int length = array.length;
        List<Boolean> result = new ArrayList<>();
        long sum = 0;
        for (int i = 0; i < length; i++) {
            sum = (sum << 1) + array[i];
            result.add(sum % 5 == 0);
            sum = sum % 5;
        }
        return result;
    }

}
