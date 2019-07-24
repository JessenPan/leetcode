package org.jessenpan.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 */
public class S4544SumII {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;
        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int numA : A) {
            for (int numB : B) {
                int sumAB = numA + numB;
                hashMap.put(sumAB, hashMap.getOrDefault(sumAB, 0) + 1);
            }
        }
        for (int numC : C){
            for (int numD : D){
                int sumCD = numC + numD;
                count += hashMap.getOrDefault(-sumCD,0);
            }
        }
        return count;
    }

}
