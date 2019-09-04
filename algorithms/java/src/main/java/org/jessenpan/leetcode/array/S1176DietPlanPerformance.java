package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 */
public class S1176DietPlanPerformance {

    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        if (calories == null || calories.length == 0) {
            return 0;
        }
        int len = calories.length, end = len - k;
        int score = 0;
        int sum = 0;
        for (int i = 0; i <= end; i++) {

            if (i == 0) {
                for (int j = i; j < i + k; j++) {
                    sum += calories[j];
                }
            } else {
                sum = sum - calories[i - 1] + calories[i + k - 1];
            }
            if (sum > upper) {
                score++;
            } else if (sum < lower) {
                score--;
            }
        }
        return score;
    }

}
