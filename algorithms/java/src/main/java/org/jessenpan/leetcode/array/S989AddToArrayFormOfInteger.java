package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author jessenpan
 * tag:array
 */
public class S989AddToArrayFormOfInteger {

    public List<Integer> addToArrayForm(int[] origin, int k) {
        int[] other = convert2Array(k);
        List<Integer> result = new LinkedList<>();
        int i = 0, length = Math.min(origin.length, other.length),carry=0;
        while (i<length||carry==1){
            
        }
        return result;
    }

    private int[] convert2Array(int k) {
        if (k == 0) {
            return new int[] { 0 };
        }
        List<Integer> list = new ArrayList<>();
        while (k != 0) {
            list.add(k % 10);
            k = k / 10;
        }
        return list.stream().mapToInt(t -> t).toArray();
    }

}
