package org.jessenpan.leetcode.math;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:math
 */
public class S202HappyNumber {

    private final static int TEN = 10;

    public boolean isHappy(int n) {

        int happyNumber = n;
        int sum, floor;
        Set<Integer> record = new HashSet<>();
        while (true) {
            sum = 0;
            while (happyNumber != 0) {
                floor = happyNumber % TEN;
                sum += floor * floor;
                happyNumber = happyNumber / TEN;
            }
            happyNumber = sum;
            if (happyNumber == 1) {
                break;
            }
            if (record.contains(happyNumber)) {
                break;
            }
            record.add(happyNumber);
        }
        return happyNumber == 1;
    }

}
