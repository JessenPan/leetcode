package org.jessenpan.leetcode.greedy;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S948BagOfTokens {

    public int bagOfTokensScore(int[] tokens, int energy) {

        Arrays.sort(tokens);
        int left = 0, right = tokens.length - 1;
        int points = 0, score = 0;
        while (left <= right && (energy >= tokens[left] || points > 0)) {
            while (left <= right && energy >= tokens[left]) {
                energy -= tokens[left++];
                points++;
            }

            score = Math.max(score, points);
            if (left <= right && points > 0) {
                energy += tokens[right--];
                points--;
            }
        }

        return score;

    }

}
