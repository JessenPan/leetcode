package org.jessenpan.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S781RabbitsInForest {

    //TODO 
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int num = 0;
        for (int answer : answers) {
            if (map.containsKey(answer) && map.get(answer) > 0) {
                map.put(answer, map.get(answer) - 1);
            } else {
                num += answer + 1;
                map.put(answer, answer);
            }
        }
        return num;
    }

}
