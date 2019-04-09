package org.jessenpan.leetcode.array;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author jessenpan
 * tag:array
 */
public class S989AddToArrayFormOfInteger {

    public List<Integer> addToArrayForm(int[] array, int k) {
        int[] kArray = convert2Array(k);
        List<Integer> sumList = new LinkedList<>();
        int length = Math.max(kArray.length, array.length);
        int i = 0, carry = 0, posSum = 0, arrayLen = array.length, kLen = kArray.length;
        while (i < length) {
            if (i < arrayLen) {
                posSum += array[arrayLen - i - 1];
            }
            if (i < kLen) {
                posSum += kArray[i];
            }
            posSum += carry;
            if (posSum >= 10) {
                carry = 1;
                posSum -= 10;
            } else {
                carry = 0;
            }
            sumList.add(posSum);
            i++;
            posSum = 0;
        }
        if (carry == 1) {
            sumList.add(1);
        }
        Collections.reverse(sumList);
        return sumList;
    }

    private int[] convert2Array(int k) {
        if (k == 0) {
            return new int[] { 0 };
        }
        List<Integer> list = new LinkedList<>();
        while (k != 0) {
            list.add(k % 10);
            k = k / 10;
        }
        return list.stream().mapToInt(t -> t).toArray();
    }
}
