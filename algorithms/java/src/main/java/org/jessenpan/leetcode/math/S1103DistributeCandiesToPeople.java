package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S1103DistributeCandiesToPeople {

    public int[] distributeCandies(int candies, int n) {
        if (candies == 0 || n == 0) {
            return new int[n];
        }

        int line = 0;
        int oneLineBaseSum = n * (n + 1) / 2;
        int sum = 0;
        while (true) {

            sum += line * n * n + oneLineBaseSum;
            if (sum < candies) {
                line++;
            } else {
                break;
            }
        }

        int[] disCandies = new int[n];
        if (line > 0) {
            for (int i = 0; i < n; i++) {
                int val = i + 1;
                int j = 0;
                while (j < line) {
                    disCandies[i] += val;
                    candies -= val;
                    val += n;
                    j++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (candies <= 0) {
                break;
            }

            int val = (i + 1) + line * n;
            if (candies > val) {
                disCandies[i] += val;
                candies -= val;
            } else {
                disCandies[i] += candies;
                candies = 0;
            }
        }

        return disCandies;
    }

}
