package org.jessenpan.leetcode.map;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S575DistributeCandies {

    public int distributeCandies(int[] candies) {
        int candieNumOfSister = candies.length / 2;
        Set<Integer> candieSet = new HashSet<>();
        for (int candy : candies) {
            candieSet.add(candy);
        }
        if(candieSet.size()>=candieNumOfSister){
            return candieNumOfSister;
        }else {
            return candieSet.size();
        }
    }
}
