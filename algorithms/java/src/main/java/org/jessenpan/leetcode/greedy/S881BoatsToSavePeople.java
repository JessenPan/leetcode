package org.jessenpan.leetcode.greedy;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S881BoatsToSavePeople {

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int len = people.length;
        int left = 0, right = len - 1;
        int n = 0;
        while (left <= right) {
            n++;
            if (left == right) {
                left++;
                right--;
            } else {
                int i = right;
                int sum = 0;
                int pNum = 0;
                while (pNum < 2 && i >= left && sum + people[i] <= limit) {
                    sum += people[i];
                    pNum++;
                    i--;
                }
                right = i;
                if (i < 0 || sum == limit || pNum == 2) {
                    continue;
                }
                i = left;
                while (pNum < 2 && i <= right && sum + people[i] <= limit) {
                    sum += people[i];
                    pNum++;
                    i++;
                }
                left = i;
            }
        }
        return n;
    }

}
