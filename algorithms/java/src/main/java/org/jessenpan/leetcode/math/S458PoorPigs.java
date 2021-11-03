package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S458PoorPigs {

    //TODO study
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int states = minutesToTest / minutesToDie + 1;
        return (int) Math.ceil(Math.log(buckets) / Math.log(states));
    }

}
