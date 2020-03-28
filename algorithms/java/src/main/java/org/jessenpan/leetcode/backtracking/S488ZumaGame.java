package org.jessenpan.leetcode.backtracking;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:dfs
 */
public class S488ZumaGame {

    private Map<String, Integer> memo = new HashMap<>();

    //TODO 
    public int findMinStep(String board, String hand) {
        int[] hands = new int[5];
        for (char c : hand.toCharArray()) {
            hands[getId(c)]++;
        }
        return helper(board, hands);
    }

    private int helper(String board, int[] hands) {
        board = removeDup(board);
        if (board.length() == 0) {
            return 0;
        }
        String s = board + Arrays.toString(hands);
        if (memo.containsKey(s)) {
            return memo.get(s);
        }
        int res = -1;
        for (int i = 0; i < hands.length; i++) {
            if (hands[i] == 0) {
                continue;
            }
            hands[i]--;
            for (int j = 0; j < board.length(); j++) {
                int subRes = helper(board.substring(0, j) + getChar(i) + board.substring(j), hands);
                if (subRes != -1) {
                    res = res == -1 ? subRes + 1 : Math.min(res, subRes + 1);
                }
            }
            hands[i]++;
        }
        memo.put(s, res);
        return res;
    }

    private String removeDup(String board) {
        int s = 0;
        for (int i = 1; i <= board.length(); i++) {
            if (i == board.length() || board.charAt(i) != board.charAt(i - 1)) {
                if (i - s >= 3) {
                    return removeDup(board.substring(0, s) + board.substring(i));
                } else {
                    s = i;
                }
            }
        }
        return board;
    }

    private int getId(char c) {
        if (c == 'W') {
            return 0;
        } else if (c == 'B') {
            return 1;
        } else if (c == 'Y') {
            return 2;
        } else if (c == 'G') {
            return 3;
        } else {
            return 4;
        }
    }

    private char getChar(int id) {
        if (id == 0) {
            return 'W';
        } else if (id == 1) {
            return 'B';
        } else if (id == 2) {
            return 'Y';
        } else if (id == 3) {
            return 'G';
        } else {
            return 'R';
        }
    }
}
